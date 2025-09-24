import java.util.Scanner;

public class QuickSort {
    
    // Input array elements
    public static void input(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Display array elements
    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // QuickSort function
    public static void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int pivotIndex = partition(arr, s, e);
            quickSort(arr, s, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, e);
        }
    }

    // Partition method (Lomuto scheme)
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, e); // place pivot correctly
        return i + 1;
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            input(arr, sc);
            quickSort(arr, 0, n - 1);
            display(arr);
        }
    }
}


// make a array 

