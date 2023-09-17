package lab7;

public class Car{
  //instance variables
  private int VIN;
  private String make;
  private String model;
  private int year;
  
  //static variables
  private static int count;
  
  //constructors - copy constructors
  public Car(){
    VIN = -1;
    make = "NONAME";
    model = "NOMODEL";
    year = -1;
  }

  public Car(int VIN, String make){
    if(VIN >0)
      this.VIN = VIN;
    this.make = make;
    model = "NOMODEL";
    year = 0;
    count++;
  }

  public Car(String model, int VIN){
    if(VIN >0)
      this.VIN = VIN;
    this.model = model;
    make = "NOMAKE";
    year = 0;
    count++;
  }

  //Copy constructor
  public Car(Car otherCar){
    this.VIN = otherCar.getVIN();
    this.make = otherCar.getMake();
    this.model = otherCar.getModel();
    this.year = otherCar.getYear();
    count++;
  }

  // Utilizing a different constructor
  public Car(int VIN, String make, String model, int year){
    this(VIN,make);
    this.model = model;
    this.year = year;
    count++;
  }
  
  //getters & setters
  public int getVIN(){
    return VIN;
  }
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    if(!checkIfOlderThan(30))
      this.year = year;
  }

  public boolean setVIN(int VIN){
    if(VIN > 0){
      this.VIN = VIN;
      return true;
    }
    else{
      return false;
    }
  }
  
  //equals method
  public boolean equals(Car otherCar){
    return (VIN == otherCar.getVIN());
      /*if(VIN == otherCar.getVIN())  this.VIN same as VIN bcs there are no other VIN 
      return true;
    return false;*/
  }
  
  //toString method
  public String toString(){
    return "VIN: "+getVIN()+ ", Make:" + getMake() + ", Model:" + getModel() + ", Year:" + getYear();
  }
  
  //private method
  private boolean checkIfOlderThan(int limit){
    if(2021-this.getYear() > limit)
      return true;
    return false;
  }
  
  //static methods
  public static void displayCount(){
    System.out.println("Number of cars created so far: " + count);  
  }
 
}
