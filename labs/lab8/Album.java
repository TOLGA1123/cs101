import java.util.*;
public class Album {
    private String name;
    private double price;
    private ArrayList <Track> tracks;
    public Album(){
    };
    public Album(String name, double price, ArrayList<Track> tracks){
        this.name = name;
        this.price = price;
        this.tracks = tracks;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        price = p;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void enterTrack(int anID , Track track){
        if(1<anID && anID<Track.numberOfTracks){
        track.setID(anID);
        }
        else{
            System.out.println("Invalid track ID!");
        }
    }
    public int longestTracksDuration(){
        int longestDuration = tracks.get(0).getDuration();
        for(int i = 0; i<tracks.size(); i++){
            if(tracks.get(i).getDuration()>longestDuration){
                longestDuration = tracks.get(i).getDuration();
            }
        }
        return longestDuration;
        }
    public String toString(){
        String tracksInAlbum = "";
        for(int i = 0; i<tracks.size(); i++){
            tracksInAlbum += tracks.get(i).getTitle() + " " + tracks.get(i).getDuration() + " and" + "\n";
        }
        String albumContents = "Album name: " + getName() + "\nAlbum price: " + getPrice()
        + "\nThis album entitled " + getName() + " at $" + getPrice() + " contains the tracks " + "\n"
        + tracksInAlbum + 
        "Longest duration is " + longestTracksDuration();
        return albumContents;
    }

}
