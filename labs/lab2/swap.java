package lab2;

public class swap {
     public static void main(String[] args) {
         // cannot really make a swap method in Java. 
        int a = 1;
        int b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Variable a is now " + a +"Variable b is now " + b);
    }
}
