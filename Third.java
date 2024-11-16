/*Sum of N Numbers in Java
Sum of N Numbers in Java can be done using the Steps mentioned below:
Take input of N Numbers
Use Loop to Add the N Numbers in Java(Iterate and Sum simultaneously)
Print the Sum calculated.*/
import java.io.*;
import java.util.*;
public class Third {
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the siize of elements");
        N=sc.nextInt();
        int sum=0;
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println("sum is"+sum);
    
    
    
        
    }
        
    }

