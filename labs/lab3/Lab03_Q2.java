package lab3;
import java.util.Scanner;
/**
 * Lab03_Q2
 */
/* This program calculates the century of the year and decide whether it is a leap year or not */
public class Lab03_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year to be evaluated: "); //positive numbers
        int year = in.nextInt();
        int century = (((year-1)/100)+1);
        String century1 = "";
        
        if(century%10==1 && century%100!=11){
            century1 = century + ("st century");
        }
        else if(century%10==2 && century%100!=12){
            century1 = century + ("nd century");
        }
        else if(century%10==3 && century%100!=13){
            century1 = century + ("rd century");
        }
        else {
            century1 = century + ("th century");
        }
        if(year>0){
            System.out.print("The year " + year + " is in the " + century1 + " and ");

            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.print(" is a leap year.");  
                    }
    
                    else{
                        System.out.print(" is not a leap year.");
                    }
                }
                else{
                    System.out.print(" is a leap year.");
                }
            }
            else{
                System.out.print(" is not a leap year.");
            }
        }
        else{
            System.out.println("Please enter a positive year.");
        
        }
    in.close();
    }
    
}


    
 
