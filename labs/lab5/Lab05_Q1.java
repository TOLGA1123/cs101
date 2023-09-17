

import java.util.Scanner;
public class Lab05_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter city plan string: ");
        String cityPlan = in.next(); //digits only
        char max = cityPlan.charAt(0);
        long max1 =  Character.getNumericValue(max);
        for(int i=0; i<cityPlan.length(); i++){
            if( Character.getNumericValue(cityPlan.charAt(i))>max1){
                max1 =  Character.getNumericValue(cityPlan.charAt(i));
            }
        }
        for(int line=0; line<max1 && max1>=0; line++){
            for(int column=0; column<cityPlan.length(); column++){
                char a = cityPlan.charAt(column);
                long a1 =  Character.getNumericValue(a);
                if (a1>=max1-line){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        } 
        in.close();
    }
}
