
import java.util.Scanner;
public class Lab04_Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = in.nextInt();
        int i = 1;
        while(i<=lines){
            i++;
            int j = 1;
            while(j<i){
                j++;
                System.out.print("*");
            }
            System.out.println();
        }
        
        in.close();
    }
}
