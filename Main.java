import java.util.Arrays;

class Main {
    public static void main (String[] args) {
        int[] arr = new int[]{-1, 9, 0, -5, 3, 5, 6, 4, 12, -9};
        
        MergeSort mergeSort = new MergeSort();
        
        mergeSort.mergeSort(arr);
        System.out.println("MergeSorted= " + Arrays.toString(arr));
        
        arr = new int[]{-1, 9, 0, -5, 3, 5, 6, 4, 12, -9};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        System.out.println("QuickSorted= " + Arrays.toString(arr));
    }
}