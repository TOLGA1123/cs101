package lab3;
import java.util.Scanner;
/**
 * Lab03_Q3
 */
/* This program  simulates a bank application */
public class Lab03_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the PIN: ");
        String PIN = in.next();
        if(PIN.equals("1234")){
            System.out.printf("1-Withdraw money"+"\n2-Open a new account"+"\n3-Change PIN");
            System.out.println("\nPlease select an operation by entering 1,2 or 3.");
        
        int operation = in.nextInt();
        double totalAmount = 1000.00;
            if(operation==1){
                System.out.print("Please enter the amount to withdraw: ");
                double amount = in.nextDouble();
                System.out.println("Your new balance is " + (totalAmount-amount) + " TRY. Bye!");
            }
            else if(operation==2){
                System.out.printf("\n 1-TRY" + "\n 2-USD");
                System.out.println("\nPlease select the account type by entering 1 or 2");
                int accountType = in.nextInt();
                if (accountType==1){
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if(accountType==2){
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }
            else if(operation==3){
                System.out.println("Enter your new PIN: ");
                String newPIN = in.next();
                System.out.println("Your PIN is changed " + newPIN.charAt(0) + "**" + newPIN.charAt(3) + ". Bye!");

        }
        }
        else{
            System.out.println("Invalid PIN! Bye!");
        
        in.close();
        }
        
    }
    
}
