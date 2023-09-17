public class User {
   private static int count = 0;
   private int ID; private String name; private int age; private String orders;
   private int numberOfOrders; private String eatenFoods;
   public User(String name, int age){
       this.name = name;
       this.age = age;
       ID = count;
       orders = "";
       numberOfOrders = 0;
       eatenFoods = "";
       addUser();
   } 
   public void setID(int anID){
       this.ID = anID;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void setOrders(String orders){
       this.orders += orders + " -";
   }
   public void setNumberOfOrders(int number){
       this.numberOfOrders = number;
   }
   public void setEatenFoods(String food){
       this.eatenFoods += food + " -";
   }
   public int getCount(){
       return count;
   }
   public int getID(){
       return ID;
   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
   public String getOrders(){
       return orders;
   }
   public int getNumberOfOrders(){
       return numberOfOrders;
   }
   public String getEatenFoods(){
       return eatenFoods;
   }
   public void addUser(){
       count++;
   }
   public boolean equals(User user){
       if(user.getID() == ID && user.getName().equals(name) && user.getAge() == age){
           return true;
       }
       else{
           return false;
       }
   }
   public boolean didEat(Food food){
       if(getEatenFoods().equals(food)){
            return true;
       }
       else{
           return false;
       }
   }
   public String pickOrderbyIndex(int index){
       return orders.split("-")[index - 1];

   }
   public void addNewOrder(Order order){
       order.setUser(this);
       orders += order.getID() + "-";
       numberOfOrders++;
       eatenFoods += getName() + ", ";
   }
   public String toString(){
       return "\nUser ID: " + getID() + ", " + "User name: " + getName() + "," + "Age: " + getAge();
   }
}
