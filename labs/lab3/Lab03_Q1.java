package lab3;
import java.util.Scanner;
/**
 * Lab03_Q1
 */
/*This program calculates user's BMI and categorize it to underweight, healthy, overweight or obese */
public class Lab03_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms: ");  //_,_ kilograms  76,0  not .
        double weight = in.nextDouble();
        System.out.println("Please enter your height in meters: "); //_,_ meters 1,89 not .
        double height = in.nextDouble();
        double BMI =(weight/(height*height));
        if (BMI<18.5){
            System.out.printf("Your BMI is: %5.2f" ,BMI);
            System.out.print(" and you are in category of underweight.");
        }
        else if(BMI<25.0) {
            System.out.printf("Your BMI is: %5.2f" ,BMI);
            System.out.print(" and you are in category of healthy.");
            }

        else if(BMI<30.0){
            System.out.printf("Your BMI is: %5.2f" ,BMI);
            System.out.print(" and you are in category of overweight.");
            }
        else {
            System.out.printf("Your BMI is: %5.2f" ,BMI);
            System.out.print(" and you are in category of obese.");
            }
    
        in.close();
    }
}

