//printing alternative numbers of arr
import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the arr: ");
        int n=sc.nextInt();
        System.out.print("enter the array values: ");
        int[] arr=new int[n];
   
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Reading the array values
        }
        for(int i=0;i<=arr.length;i+=2){
            System.out.println(arr[i]+"     ");
        }


    }
    
}
