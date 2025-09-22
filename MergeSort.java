import java.util.Scanner;

public class MergeSort {

    // Method to input array elements
    public static void input(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to print array elements in one line
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Recursive merge sort
    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    // Merge two sorted halves
    public static void merge(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
        // Copy sorted temp array back to original array
        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n, sc);

        System.out.print("Original array: ");
        print(arr);

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array: ");
        print(arr);

        sc.close();
    }
}
