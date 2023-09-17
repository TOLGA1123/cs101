

import java.util.Scanner;
public class binaryconverter {
    public static String binaryConverter (int n){
        if(n==0 || n==1){
            return ""+n;
        }
        return binaryConverter(n/2) + (n%2);
    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number to be converted: ");
    int number = in.nextInt();
    System.out.println("Binary presentation of the number is: " + binaryConverter(number));
    in.close();
}
}
