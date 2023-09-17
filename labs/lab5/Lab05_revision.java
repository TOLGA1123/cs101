

import java.util.Scanner;
public class Lab05_revision { 
    //if it is equal to afterD value x2 ** print  only x2 after the character 'D'  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter city plan string: ");
        String cityPlan = in.next(); 
        char max = cityPlan.charAt(0);
        long max1 =  Character.getNumericValue(max); 
        for(int i=0; i<cityPlan.length(); i++){
            if(cityPlan.charAt(i)=='D'){
            }
            else if( cityPlan.charAt(i) != 'D' && Character.getNumericValue(cityPlan.charAt(i))>max1){
                max1 =  Character.getNumericValue(cityPlan.charAt(i));
            }
        }
        for(int row=0; row<max1 && max1>=0; row++){
            for(int column = 0; column<cityPlan.length(); column++ ){
                char a = cityPlan.charAt(column);
                long a1 = Character.getNumericValue(a);
                char afterD = cityPlan.charAt(cityPlan.indexOf('D')+1);
                if ( a1>=max1-row && a != 'D' && a != afterD){
                    System.out.print("*");
                }
                else if(a == 'D'){
                }
                else if( a == afterD){
                    if(a1>=max1-row){
                        System.out.print("**");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if (a1<max1-row && a != 'D' && a != afterD){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
