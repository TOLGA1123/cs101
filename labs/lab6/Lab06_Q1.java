

import java.util.Scanner;
/**
 * Lab06_Q1
 */
public class Lab06_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be examined: ");
        int number = in.nextInt();
        if(number>0){
            System.out.println("Number of digits: " + countDigits(number));
            System.out.println("Sum of digits: " + sumOfDigits(number));
            if(isFibonacci(number)){
                System.out.println(number + " is a Fibonacci number.");
            }
            else{
                System.out.println(number + " is not a Fibonacci number.");
            }
            if(isHarshad(number)){
                System.out.println(number + " is a Harshad number.");
            }
            else{
                System.out.println(number + " is not a Harshad number.");
            }
            if(isNarcisstic(number)){
                System.out.println(number + " is a Narcisstic number.");
            }
            else{
                System.out.println(number + " is not a Narcisstic number.");
            }
            if(isPrime(number)){
                System.out.println(number + " is a Prime number");
            }
            else{
                System.out.println(number + " is not a Prime number");
            }
        }
        else{
            System.out.println("Enter a positive number.");
        }
    in.close();
    }
    /**
     * check whether or not given number is a perfect square
     * @param x the given number
     * @return true if x is a perfect square
     */
    public static boolean isPerfectSquare (int x){
        int a = (int) Math.sqrt(x);
        return (a*a==x);
        }
    /**
     * checks if the given number is a Fibonacci number or not
     * @param x the given number
     * @return true if the number is a Fibonacci number
     */
    public static boolean isFibonacci (int x){
        return isPerfectSquare(5*x*x-4) || isPerfectSquare(5*x*x+4);
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
    /**
     * checks if the given number is a Harshad number or not
     * @param x the given number
     * @return true if x is Harshad number
     */
    public static boolean isHarshad (int x){
        int sum = sumOfDigits(x);
        return (x%sum==0);
    }
    /**
     * checks if the given number is a Prime number or not
     * @param x the given number
     * @return true if x is Prime number
     */
    public static boolean isPrime (int x){
        if(x<=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(x); i++){ //1 and x is not included on %
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    /**
     * Computes x to the power of y
     * @param x base of the number
     * @param y power of the number
     * @return the result
     */
    public static int power (int x, int y){
        int result = 1;
        for(int i=1; i<=y; i++){
            result = result*x;
        }
        return result;
    }
    /**
     * count the digits of a given number
     * @param x the given number
     * @return count of digits of x
     */
    public static int countDigits (int x){
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        return count;
    }
    /**
     * checks if the given number is Narcisstic number or not
     * @param x the given number
     * @return true if the number is Narcisstic number
     */
    public static boolean isNarcisstic (int x){
        int numberOfDigits = countDigits(x); int sum = 0; int number = x; // changing x cause problems define a new variable stores x
        while(x>0){
            sum += power(x%10,numberOfDigits);
            x = x/10;

        }
        return(number==sum);
    }

}