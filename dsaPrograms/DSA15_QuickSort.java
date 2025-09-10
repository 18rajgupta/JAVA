package dsaPrograms;

public class DSA15_QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i <= high - 1) {
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;   //PARTITION INDEX
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("Before quick sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, n - 1);
        System.out.println("After quick sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}