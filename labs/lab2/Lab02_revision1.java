package lab2;
import java.util.Scanner;
public class Lab02_revision1 {
//* This program calculates the circumference, area and diagonal of a regular  octagon*/
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the side of the octagon: ");
    double side = in.nextDouble();
    double circumferenceOfOctagon = (side*8);
    double areaOfOctagon = (2*Math.pow(side,2)*(1+Math.sqrt(2))); 
    double diagonalOfOctagon =  (side*Math.sqrt(4+2*Math.sqrt(2)));  //long diagonal
    System.out.println("Circumference of the octagon is: " + circumferenceOfOctagon);
    System.out.println("Area of the octagon is :" + areaOfOctagon);
    System.out.println("Long diagonal of Octagon is :" + diagonalOfOctagon);
    in.close();
    }    
}
