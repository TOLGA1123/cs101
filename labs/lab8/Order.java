public class Order {
    private static int count;
    private int ID; private Food orderedFood; private double portion; private double totalPrice;
    private String name; private double price; private User user; private boolean discount;
    public Order(double portion, String name, double price){
        this.portion = portion;
        this.name = name;
        this.price = price;
        this.ID = count;
        addOrder();
    }
    public Order(double portion, Food orderedFood){
        this.portion = portion;
        this.orderedFood = orderedFood;
        this.ID = count;
        name = orderedFood.getName();
        totalPrice = 0.0;
        price = orderedFood.getPrice();
        
        addOrder();
    }
    public boolean getDiscount(){
        return discount;
    }
    public void setDiscount(boolean discount){
        discount = true;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setUser(User user){
        this.user = user;
    }
    public User getUser(){
        return user;
    }
    public void setID(int anID){
        this.ID = anID;
    }
    public void setOrderedFood(Food orderedFood){
        this.orderedFood = orderedFood;
    }
    public void setPortion(double portion){
        this.portion = portion;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
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
    public Food getOrderedFood(){
        return orderedFood;
    }
    public double getPortion(){
        return portion;
    }
    public double getPrice(){
        return price;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void addOrder(){
        count++;
    }
    public boolean equals(Order order){
        if(order.getID()==ID){
            return true;
        }
        else{
            return false;
        }
    }
    public void checkout(){
        if(!getDiscount()){
        this.totalPrice = getPortion() * getPrice();
        }
        else{
            totalPrice = getPortion() * getPrice() * 0.8;
        }
    }
    public void increasePortion(int extraPortion){
        portion += extraPortion;
    }
    public String toString(){
        String bill = "\nDetails for Order " + getID() + ":" + "\n" + getName() + "(x" + getPortion()
            + ")" + "\nTOTAL: " + getTotalPrice() + "\n";
        if(totalPrice == 0.0){
            return "\n>> Warning: This order is incomplete."  + bill ;
        }
        else{
            return bill;
        }
        
    }

}
