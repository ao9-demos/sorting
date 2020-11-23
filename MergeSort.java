class MergeSort {
    private int[] arr;
    
    public void mergeSort(int[] arr) {
        this.arr = arr;
        sort(0, arr.length-1);
    }
    
    private void sort(int low, int high) {
        if(low == high) return;
        int mid = (low + high) / 2;
        sort(low, mid);
        sort(mid+1, high);
        merge(low, mid, high);
    }
    
    private void merge(int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < mid - low + 1; i++) {
            left[i] = arr[i+low];
        }
        for(int j = 0; j < high - mid; j++) {
            right[j] = arr[j+mid+1];
        }
        
        for(int i = 0, j = 0, k = low; k <= high; k++) {
            if(j >= high - mid) {
                arr[k] = left[i];
                i++;
            } else if(i >= mid - low + 1) {
                arr[k] = right[j];
                j++;
            } else if(left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
        }
        
    }
}