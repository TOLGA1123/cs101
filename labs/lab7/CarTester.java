package lab7;

/**
 * Auto Generated Java Class.
 */

public class CarTester {
  
  public static void main (String[] args){
    Dealer ozDealer = new Dealer("Ozcan's Shop");
    Car c1 = new Car(123,"Honda","Prelude",1990);
    Car c2 = new Car(234,"Honda","Jazz",1990);
    Car c3 = new Car(345,"Honda","Accord",1990);
    ozDealer.addCar(c1);
    ozDealer.addCar(c2);
    ozDealer.addCar(c3);
    System.out.println(ozDealer);
    //ozDealer.remove
  }
  
}
