public class Course implements Comparable{
  private String name;
  private String code;
  private double grade;
  
  public Course(String name, String code, double grade){
    this.name = name;
    this.code = code;
    setGrade(grade);
  }
  
  public void setGrade(double grade){
    if(grade>=0 && grade<=4)
      this.grade = grade;
  }
  
  public String getName(){
    return name;
  }
  public String getCode(){
    return code;
  }
  public double getGrade(){
    return grade;
  }
  public String toString(){
    return "Code - "+getCode()+" - Course:"+getName()+" - Grade: " + getGrade();    
  }

  //public int compareTo(Course otherCourse){
  public int compareTo(Object other){
    Course otherCourse = (Course) other; 
    return this.getCode().compareTo(otherCourse.getCode());
    /*if(this.getCode().equals(otherCourse.getCode()))
      return 0;
    else if(this.getCode().compareTo(otherCourse.getCode())>0)
      return 1;
    else 
      return -1;    
    */
  }
  
  
  
}
