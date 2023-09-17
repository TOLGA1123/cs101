

import java.util.Scanner;
public class Lab06_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be examined: ");
        int number = in.nextInt();
        if( isNeon(number)){
            System.out.println(number + " is a Neon number.");
        }
        else {
            System.out.println(number + " is not a Neon number");
        }
        in.close();
    }
    /**
     * 
     * @param x the number
     * @return true if the number is Neon number
     */
    public static boolean isNeon (int x){
        return(sumOfDigits(x*x)==x);
    }
    /**
     * computes sum of digits of the given number
     * @param x the given number
     * @return the sum of digits of x
     */
    public static int sumOfDigits (int x){
        int sum = 0;
        while ( x>0){
            int digit = x%10;
            sum += digit;
            x = x/10;
        }
        return sum;
    }
}
