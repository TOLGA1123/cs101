package lab7;

public class Player {
    private static int count = 0;
    private static int allCount = 0;
    private int id;  private String name; private String position; 
    private String team; private int rosterNumber; private boolean isActive;
    private double gamesPlayed; private double pointsPerGame; private double assistsPerGame;
    private double reboundsPerGame; private double turnoversPerGame;
    private double totalPoints; private double totalAssists; private double totalRebounds; private double totalTurnovers;
    public Player(String name, String position, String team, int rosterNumber) {
        this.register();
        this.name = name; 
        this.position = position;
        this.team = team;
        this.rosterNumber = rosterNumber;
        id = allCount;
        gamesPlayed = 0; 
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return(name);
    }
    public void setPosition(String p){
        if(p.equals("SF") || p.equals("PF") || p.equals("PF") || p.equals("SG") || p.equals("PG") || p.equals("C")){
        position = p;
        }
        else{
            System.out.println("Error! Invalid position");
        }
    }
    public String getPosition(){
        return(position);
    }
    public String getTeam(){
        return(team);
    }
    public boolean isActive(){
        return(isActive);
    }
    public void setRosterNumber(int r){
        rosterNumber = r;
    }
    public int getRosterNumber(){
        return(rosterNumber);
    }
    public void register(){
        count++;
        allCount++;
        isActive = true;
    }
    public void remove(){
        count--;
    }
    public void retire(){
        count--;
        isActive = false;
    }
    public void transfer( String t){   
        if(t.equals(this.getTeam())){
            System.out.println("Select a different team. ");
        }
        else{
            team = t;
        }
    }
    public boolean isBeforeThan(Player n){
        if(n.getName().compareTo(this.getName())>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void recordGame(double points , double assists , double rebounds , double turnovers ){
        gamesPlayed++;
        totalPoints += points;
        totalAssists += assists;
        totalRebounds += rebounds;
        totalTurnovers += turnovers;
        pointsPerGame = totalPoints/gamesPlayed;
        assistsPerGame = totalAssists/gamesPlayed;
        reboundsPerGame = totalRebounds/gamesPlayed;
        turnoversPerGame = totalTurnovers/gamesPlayed;
    }
    public double getEfficiency(){
        double efficiency = 1.0*pointsPerGame+0.7*assistsPerGame+0.7*reboundsPerGame-0.9*turnoversPerGame;
        return efficiency;
    }
    public boolean isMoreEfficient(Player n){
        if(this.getEfficiency()>n.getEfficiency()){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        String a = "**************************************************" +
        "\nPlayer ID:" + id + "\nPlayer Name:" + name + "\nPlayer Position: " + position
        + "\nCurrent Team: " + team + "\nJersey number: " + rosterNumber + "\n--------------------------------------------------"+
         "\nStats: " + "\nPPG: " + Math.round(100.0*pointsPerGame)/100.0
        + "\nAPG: : " +  Math.round(100.0*assistsPerGame)/100.0 + "\nRPG: " +  Math.round(100.0*reboundsPerGame)/100.0 + "\nTPG: " +  Math.round(100.0*turnoversPerGame)/100.0 + "\nEfficiency: "
        + Math.round(100.0*this.getEfficiency())/100.0 + "\n--------------------------------------------------" +
        "\n Retirement status: " ;
        if (isActive()){
            return a + "\nActive among " + count + " active player(s)." + "\n**************************************************";
        }
        else{
            return a + "\nPlayer is not active." + "\n**************************************************";
        }
    }


}
