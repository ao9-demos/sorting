class QuickSort {
    private int[] arr;
    
    public void quickSort(int[] arr) {
        this.arr = arr;
        
        sort(0, arr.length-1);
    }
    
    private void sort(int low, int high) {
        if(low >= high) return;
        int pivot = arr[high];
        int i = low;
        
        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                swap(i, j);
                i++;
            }
        }
        swap(i, high);
        
        sort(low, i-1);
        sort(i+1, high);
    }
    
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}