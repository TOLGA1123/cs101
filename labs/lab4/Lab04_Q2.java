
import java.util.Scanner;
public class Lab04_Q2 {
    /* this program checks a string whether is an palindrome or not */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string : ");
        String input = in.nextLine();
        int i = 0; int j = input.length()-1; //last character of the string
        while (i<j && input.charAt(i) == input.charAt(j) ){
            i++; j--;
        }
            if(input.charAt(i) == input.charAt(j)){
                System.out.println("It is a palindrome.");
            }
            else{
                System.out.println("It is not a palindrome.");
            }
        in.close();
    }
}
