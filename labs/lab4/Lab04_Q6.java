
import java.util.Scanner;
public class Lab04_Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = in.nextInt(); 
        int i = 1;
        while(i<=lines){
            i++;
            int j = lines;  int k=1;
            while(i<=j){
                j--;
                System.out.print("  "); //2space
            }
            while(k<=2*j-1){
                k++;
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
