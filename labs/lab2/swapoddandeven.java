package lab2;
import java.util.Scanner;
public class swapoddandeven {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to be converted: ");
    String str = in.nextLine();
    System.out.println(changeOddEven(str));
    in.close();
    }
    public static String changeOddEven(String input){
        String str1 = "";
        for(int i=0; i<input.length(); i++){
            if(i%2==0){
                str1 += input.charAt(i+1);
            }
            else{
                str1 += input.charAt(i-1);
            }
        }
        return str1;
    }
    
}