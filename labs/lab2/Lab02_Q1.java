package lab2;
import java.util.Scanner;
/* this program calculates the area, diagonal and circumference of a rectangle */
public class Lab02_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the width of the rectangle: ");
        double widthOfRectangle = in.nextDouble();

        System.out.print("Please enter the height of the rectangle: ");
        double heightOfRectangle = in.nextDouble();

        double areaOfRectangle = (heightOfRectangle*widthOfRectangle);
        double circumferenceOfRectangle = (2*(widthOfRectangle+heightOfRectangle));
        double diagonalOfRectangle = (Math.sqrt((Math.pow(widthOfRectangle,2))+(Math.pow(heightOfRectangle,2))));
        System.out.print("The area of the rectangle is: ");
        System.out.printf("%16.3f",areaOfRectangle);
        System.out.println();
        System.out.print("The circumference of rectangle is: ");
        System.out.printf("%10.3f",circumferenceOfRectangle);
        System.out.println();
        System.out.print("The diagonal of the rectangle is ");
        System.out.printf("%12.3f",diagonalOfRectangle);
        in.close();
    }
}
    