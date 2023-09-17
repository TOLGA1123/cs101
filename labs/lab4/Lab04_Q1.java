
import java.util.Scanner;
/**
 * Lab04_Q1
 */
/*this program calculates nth fibonacci number*/
public class Lab04_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input n: ");
        long n = in.nextInt();
        long i1 = 0; long i2 = 1; long sum = 0;
        int i = 1;
        while(i<=n-1){
            i++;
            sum= i1 + i2;
            i1= i2; 
            i2 = sum;
        }
        if(n==0){
            System.out.println("Fib (" +n+ ") is " + 0 );
        }
        else if(n==1 ){
            System.out.println("Fib (" +n+ ") is " + 1 );
        }
        else{
            System.out.println("Fib (" +n+ ") is " + sum);
        }
        in.close();
    }
}