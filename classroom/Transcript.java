import java.util.Arrays;

public class Transcript{
  
  private int numberOfCourses;
  private Course[] courses;
  private final int MAXNUMBEROFCOURSES = 10;
  
  public Transcript(){
    numberOfCourses = 0;
    courses = new Course[MAXNUMBEROFCOURSES]; //initialize array in constructor
  }

  public Transcript(Course[] courses){
   this.courses = courses;
   numberOfCourses = 0;
   for(int i=0; i<courses.length; i++){
     if(courses[i]!=null)
       numberOfCourses++;
   } 
  }

  public void sort(){
    Arrays.sort(courses,0,numberOfCourses);
  }
  
  
  public boolean addCourse(Course c){
    if(numberOfCourses < MAXNUMBEROFCOURSES){
      courses[numberOfCourses] = c;
      numberOfCourses++;
      return true;
    }
    return false;    
  }

  public boolean addCourseSorted(Course c){
    if(numberOfCourses < MAXNUMBEROFCOURSES){
      int pos = 0;
      boolean found = false;
      // Find the position of the added course
      for(int i=0; (i<numberOfCourses) && (!found); i++){
        if(c.compareTo(courses[i])<0){
          pos = i;
          found = true;
        }
      }
      //Shift everything to one right position starting with the last one
      for(int i=numberOfCourses; (i>pos); i--){
        courses[i]=courses[i-1];
      }
      //Insert this new course to the proper position
      courses[pos] = c;
      numberOfCourses++;
      return true;
    }
    return false;    
  }

  
  public boolean dropCourse(int index){
    if(numberOfCourses > 0 && index < numberOfCourses){
      for(int i = index+1; i < numberOfCourses; i++)
      {
        courses[i-1] = courses[i];
      }
      numberOfCourses--;
      courses[numberOfCourses] = null;// Can we do this within the loop as well?
      return true;
    }
    return false;    
  }
  
  public boolean searchCourse(String courseCode){
    for(int i=0; i<numberOfCourses; i++){
      if(courses[i].getCode().equals(courseCode))
        return true;
    }
    return false;
  }
  
  public String toString(){
    String result = "Number of courses: "+numberOfCourses+"\n";
    for(int i=0; i<numberOfCourses; i++){
      result += courses[i] +"\n";
    }
    return result;
  }
}