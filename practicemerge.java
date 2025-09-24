import java.util.*; // Import all classes from java.util package

public class practicemerge { // Define the class practicemerge
    public static void input( String arr[] ,int n,Scanner sc){ // Method to take input for array elements
        for(int i = 0;i<n;i++){ // Loop through each index of the array
        System.out.print("Enter element " + (i+1) + ": "); // Prompt user for input
        arr[i] = sc.nextLine(); // Read input and store in array
        }   
    }
    public static void sort(String arr[], int n){ // Method to sort and print the array
        Arrays.sort(arr); // Sort the array using built-in sort
        System.out.println("Sorted array:"); // Print message before displaying sorted array
        for(int i = 0;i<n;i++){ // Loop through sorted array
        System.out.print(arr[i] + " "); // Print each element followed by space
        }
        System.out.println(); // Print newline after array
    }
 
    public static void main(String[] args) { // Main method, entry point of program
    Scanner sc = new Scanner(System.in); // Create Scanner object for input
    System.out.println("Enter the size of the first array:"); // Prompt user for array size
    int n = sc.nextInt(); // Read integer input for array size
    String arr[] = new String[n]; // Declare array of Strings with size n
    input(arr, n, sc); // Call input method to take input for array elements
    // display 
    System.out.println("Array before merging:"); // Print message before displaying array
    for(int i =0;i<n;i++){ // Loop through array
        System.out.print(arr[i] + " "); // Print each element followed by space
    }
    System.out.println(); // Print newline after array
    sort(arr, n); // Call sort method to sort and print the array
    sc.close(); // Close Scanner object to prevent resource leakage

    
    }    
}
