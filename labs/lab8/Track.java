public class Track {
    private String title;
    private int duration;
    private int id;
    static int numberOfTracks = 0;
    // default constructor
    public Track(){

    }
    public Track (String title, int duration){
        this.title = title;
        this.duration = duration;
        numberOfTracks++;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setDuration(int d){
        duration = d;
    }
    public int getDuration(){
        return duration;
    }
    public void setID(int anID){
        this.id = anID; 
    }
    public int getID(){
        return id;
    }
    public String toString(){
        return "What is the title of the album? " + getTitle() + "\nHow long is it in seconds? " + getDuration();
    }
}
