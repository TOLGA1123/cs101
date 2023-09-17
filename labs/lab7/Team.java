package lab7;

public class Team {
    private String name;
    private String abbrevation;
    private String stadiumName;
    private int playerCount;
    private String city;
    public Team (String name, String abbrevation, String stadiumName, String city){
        this.name = name;
        this.abbrevation = abbrevation;
        this.stadiumName = stadiumName;
        this.city = city;
        this.playerCount= 0;
    }
    public void transferPlayer (Team newTeam){
        playerCount++;
    }
    public void releasePlayer (){
        playerCount--;
    }
    public void changeStadium(String stadiumName){
        this.stadiumName = stadiumName;
    }
    public void changeOwnership(String name, String abbrevation, String city){
        this.name = name;
        this.abbrevation = abbrevation;
        this.city = city;
    }
    public String toString (){
        return "\n****************************************" +
        "\nTeam name: " + name + "\nAbbrevation: " + abbrevation + "\nNumber of players: " + playerCount + 
        "\nStadium name: " + stadiumName + "\nCity: " + city + "\n****************************************";
    }
    
}
