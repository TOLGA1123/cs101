package lab2;
import java.util.Scanner;
/**  this program computes the maintanence costs of a car */
public class Lab02_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers: ");
        double odometer = in.nextDouble();

        System.out.println();
        final double ODOMETER_RATE = 0.1;
        final double TOTAL_MAINTANENCE_COST = (odometer*ODOMETER_RATE);  //Total amount of maintanence cost
        final double OIL_CHANGE_RATE = 0.3;
        final double BATTERY_RATE = 0.15;
        final double BRAKES_RATE = 0.25;
        final double TIRE_RATE= 0.13;
        final double OTHER_RATE= 0.17;

        double oilChange = (OIL_CHANGE_RATE*TOTAL_MAINTANENCE_COST); //Oil change costs
        double battery = (BATTERY_RATE*TOTAL_MAINTANENCE_COST); // Battery costs
        double brakes = (BRAKES_RATE*TOTAL_MAINTANENCE_COST);  //Brakes costs
        double tire = (TIRE_RATE*TOTAL_MAINTANENCE_COST);  //Tire costs
        double other = (OTHER_RATE*TOTAL_MAINTANENCE_COST);  //Other costs

        System.out.println("***************************************************");
        System.out.println("****** Maintenance Cost Distribution Table ********");
        System.out.println("***************************************************");
        System.out.printf("%-24s%s%s%21.2f","Oil Change","%",OIL_CHANGE_RATE*100,oilChange);

        System.out.println("*");
        System.out.printf("%-24s%s%s%21.2f","Battery","%",BATTERY_RATE*100, battery);

        System.out.println("*");
        System.out.printf("%-24s%s%s%21.2f","Brakes","%",BRAKES_RATE*100, brakes);

        System.out.println("*");
        System.out.printf("%-24s%s%s%21.2f","Tire","%",TIRE_RATE*100,tire);

        System.out.println("*");
        System.out.printf("%-24s%s%s%21.2f","Other", "%",OTHER_RATE*100,other);

        System.out.println("*");
        System.out.printf("%-24s","*");
        System.out.printf("%s%21.2f","TOTAL",TOTAL_MAINTANENCE_COST);
        System.out.print("*");
        System.out.println();
        System.out.println("***************************************************");

        in.close();
        }
    
}
