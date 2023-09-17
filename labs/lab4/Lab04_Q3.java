
import java.util.Scanner;
public class Lab04_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input n: ");
        int n = in.nextInt();
        System.out.println("Now input " + n + " positive integers: ");
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
        int count = 1;
        double total = 0; double average = 0;
        while(n>0 && count<=n){
            int input = in.nextInt();
            count++;
            total = total + input;
            if(input>max){
                max = input;
            }
            if(input<min){
                min = input;
            }
            average = (total/n);
            
        }
        System.out.printf("Max: " + max + "\nMin: " + min + "\nAverage: " + average );
        in.close();
    }
    
}
