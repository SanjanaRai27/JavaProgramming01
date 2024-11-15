//Using Bit Manipulation for Addition of Two Numbers in Java
//Bitwise Operators are the operators that can directly operate on the bit values.
//sum of two numbers
public class Second {
    public static int Sums(int a,int b){
        if(b==0){
            return a;
        }else{
            return Sums(a ^ b , (a & b)<<1);

        }

    }
    public static void main(String[] args) {
        Second s=new Second();
        int result=s.Sums(2,3);
        System.out.println(result);
    }
    
}
