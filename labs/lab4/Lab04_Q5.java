
import java.util.Scanner;
public class Lab04_Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
        int count = 0;
        double total = 0; double average = 0;
        boolean x = false;
        int input = 0;
        while(!x && input>=0 ){ // execute loop while x is false
            System.out.print("Now input positive integers: ");
            input = in.nextInt();
            if(input>=0){
                total = total + input;
                count++;
            if(input>max){
                max = input;
            }
            if(input<min){
                min = input;
            }
            average = (total/count); 
            }
            else{
            x = true;
            }
        }
        System.out.printf("Max: " + max + "\nMin: " + min + "\nAverage: " + average );
        in.close();
    }
}
