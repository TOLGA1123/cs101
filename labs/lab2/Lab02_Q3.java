package lab2;
import java.util.Scanner;
public class Lab02_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the title: ");  //3 spaces on first 4 spaces on last  War and Peace
        String title = in.nextLine();
        int n = title.length();
        System.out.println("--------------------------------------");
        System.out.println("Number of characters: " + n);
        System.out.println("All uppercase: " +title.toUpperCase());
        System.out.println("Remove leading and trailing blank characters: " +title.strip());
        System.out.println("Character at index position 5: " +title.charAt(5));
        System.out.println("Title from 3rd character to 8th character (not included): " +title.substring(2,7));
        System.out.println("First occurence of character 'a':" +title.indexOf('a'));
        System.out.println("Last occurence of character 'a': " +title.lastIndexOf('a'));
        in.close();



    }    
}
