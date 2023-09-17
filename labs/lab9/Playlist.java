import java.util.ArrayList;
import java.util.Collections;
public class Playlist {
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;
    public Playlist(){
    }
    public Playlist(String name, String creator, String genre, ArrayList<Song> songs){
        this.name = name;
        this.creator = creator;
        this.genre = genre;
        this.songs = songs;
    }
    public String getName(){
        return name;
    }
    public String getCreator(){
        return creator;
    }
    public String getGenre(){
        return genre;
    }
    public ArrayList<Song> getSongs(){
        return songs;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setSongs(ArrayList<Song> songs){
        this.songs = songs;
    }
    public boolean songExists(Song song){
        for(int i = 0; i<songs.size(); i++){
            if(songs.get(i) == song){
                return true;
            }
        }
        return false;
    }
    public void addSong(Song song){
        if(!songs.contains(song)){
            songs.add(song);
        }
    }
    public void removeSong(Song song){
        songs.remove(song);
    }
    public void sortByDurationDesc(ArrayList<Song> songs){    //descending +reverseOrder()  ascending Collections.sort(list)
        Collections.sort(songs,Collections.reverseOrder());
    }
    public String toString(){
        String playlist = "\n*************************************************" +
        "\n--------------------------------------------------------" +
        "\nDisplaying the playlist: " + getName() + "\n--------------------------------------------------------" +
        "\nPlaylist name: " + getName() + "\nCreator name: " + getCreator() +
        "\nGenre: " + getGenre() + "\n--------------------------------------------------------" ;
        String songsInPlaylist = "";
        for(int i = 0; i<songs.size(); i++){
            songsInPlaylist += songs.get(i).toString();
        }
        return playlist + songsInPlaylist;
    }
    
}
