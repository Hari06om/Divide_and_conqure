import java.util.*;

public class Pattern {

    public static void maxelement(int arr[]){
        int max = arr.length/2;
        for(int i=0 ;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
        }
        if(count >= max){
            System.out.println("The maximum repeating element is: " + arr[i]);
    
            break;
    
            }
    
            }
    
        
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements:");
    for(int i=0 ;i<n;i++){
        arr[i] = sc.nextInt();
    }
    maxelement(arr);
    sc.close();

    }
}
