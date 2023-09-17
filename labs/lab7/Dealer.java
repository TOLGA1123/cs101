package lab7;

/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class Dealer {
  
  private String name;
  private ArrayList<Car> cars;
  
  public Dealer(String name){
    this.name = name;
    cars = new ArrayList<Car>();
  }
  
  public void addCar(Car newCar){
    cars.add(newCar);
  }
  
  public String toString(){
    return "Name: " + name + "Cars: " + cars.toString();
  }
  /* ADD YOUR CODE HERE */
  
}
