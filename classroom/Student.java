

public class Student{
 private String name;
 private int ID;
 private Transcript transcript;
 
 public Student(String name, int ID, Transcript tr){
   this.name = name;
   this.ID = ID;
   transcript = tr;
 }
 
 public String toString(){
  String result="";
  result += "Student name: "+name;
  result += ", ID: "+ID+"\n";
  result += transcript;  
  return result; 
 }
  
}