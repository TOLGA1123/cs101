public class Food {
    private String name; private String ingredients; private int calories;
    private String type; private double price;
    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Food(String name, String ingredients, int calories, String type, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.type = type;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getIngredients(){
        return ingredients;
    }
    public int getCalories(){
        return calories;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public boolean equals(Food food){
        if(name.equals(food.getName()) && ingredients.equals(food.getIngredients())){
            return true;
        }
        else{
            return false;
        }
    }
    public void addNewIngredients(String newIngredient){
        ingredients += ", " + newIngredient;
    }
    public boolean doesContain(String ingredient){
        if(this.getIngredients().contains(ingredient)){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return getName() + " is a " + getType() + " dish." 
        + "\nIt includes " + getIngredients() + "." +
        "\nSingle portion contains " + getCalories() + " calories" +
        "\nSingle serving cost = " + getPrice();
    }

}
