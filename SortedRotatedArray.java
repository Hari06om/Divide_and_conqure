import java.util.*;

public class SortedRotatedArray {
    // Method to take input for the array
    public static void input(int arr[], int n, Scanner sc) {
        System.out.println("Enter the elements of the array: "); // Prompt user for array elements
        for (int i = 0; i < n; i++) { // Loop through each index of the array
            arr[i] = sc.nextInt(); // Read integer from user and assign to array
        }
    }

    // Method to search for a target in a sorted rotated array using recursion
    public static int search(int arr[], int tar, int s, int e) {
        // Base case: if start index exceeds end index, element not found
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2; // Calculate middle index to avoid overflow

        // Case 1: If middle element is the target, return its index
        if (arr[mid] == tar) {
            return mid;
        }

        // Case 2: If left half is sorted
        if (arr[s] <= arr[mid]) {
            // Case a: If target is in the left half
            if (arr[s] <= tar && tar <= arr[mid]) {
                return search(arr, tar, s, mid - 1); // Search in left half
            } else {
                return search(arr, tar, mid + 1, e); // Search in right half
            }
        }
        // Case 3: If right half is sorted
        else {
            // If target is in the right half
            if (arr[mid] <= tar && tar <= arr[e]) {
                return search(arr, tar, mid + 1, e); // Search in right half
            } else {
                return search(arr, tar, s, mid - 1); // Search in left half
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");

            int n = sc.nextInt();
            int arr[]  = new int[n];
            input(arr, n, sc);
            int tar = sc.nextInt();
            int tarind = search(arr, tar, 0, n-1);
            if(tarind == -1){
                System.out.println("Element not found in the array.");
            }else{
                System.out.println("Element found at index: " + tarind);
            }
        }
    }

}