package lab2;

public class Lab02_revision2 {
    public static void main(String[] args) {
        String titleOfTheBook = ("War and Peace");
        
        String firststr = titleOfTheBook.substring(4,8);
        String secondstr = titleOfTheBook.substring(8,11);
        String thirdstr = titleOfTheBook.substring (11,12);
        String thirdstr1 = thirdstr.toUpperCase();
        String thirdstr2 = titleOfTheBook.substring(12,13);
        String fourthstr= titleOfTheBook.substring(0,4);
        System.out.println( firststr + secondstr + thirdstr1 + thirdstr2 + " " +fourthstr );
        }
    
}
