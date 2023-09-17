/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class ClassroomTester {
  
  public static void main (String[] args){
    
    //Course[] s1courses = new Course[10];
    
    Course s1c1 = new Course("Algorithms and Programming I", "CS101", 3.5);
    Course s1c2 = new Course("Algorithms and Programming II", "CS102", 4);
    Course s1c3 = new Course("Digital Design", "CS223", 4);
    Course s1c4 = new Course("Computer Organization", "CS224", 3);
    
    Transcript s1t = new Transcript();
    s1t.addCourseSorted(s1c3);
    s1t.addCourseSorted(s1c2);
    s1t.addCourseSorted(s1c4);
    s1t.addCourseSorted(s1c1);
    
    s1t.sort(); // something wrong in sort method cannot sort
    
    Student s1 = new Student("Ozcan Ozturk",123,s1t);
    System.out.println(s1);
    
  }
  
}
