package lab8;
public class Homework2 {
    public static int calcFibA(int n){
        if (n<2){
            return n;
        }
        return calcFibA(n-1) + calcFibA(n-2);
    }
    public static int calcFibB(int n){
        if(n<2){
            return n;
        }
        int prev = 0;
        int a = 1;
        int i = 2;
        int next = 0;
        while(i<=n){
            next = prev + a;
            prev = a;
            a = next;
            i++;
        }
        return next;
    }
    public static void main(String[] args) {
        for(int n=0; n<=50; n=n+5){
            long start1 = System.nanoTime();
            calcFibA(n); 
            long end1 = System.nanoTime();
            System.out.println("For n= " + n + " Fib_" + n + " is calculated in " + (end1-start1) + " nanoseconds.") ;
        }
        System.out.println();
        for(int n=0; n<=50; n=n+5){
            long start2 = System.nanoTime();
            calcFibB(n);
            long end2 = System.nanoTime(); 
            System.out.println("For n= " + n + " Fib_" + n + " is calculated in " + (end2-start2) + " nanoseconds."); 
        }
    }
}


