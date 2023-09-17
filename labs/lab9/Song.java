public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;
    public Song(String title, String artist, String album, int duration, int timesPlayed){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.timesPlayed = timesPlayed;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public int getDuration(){
        return duration;
    }
    public int getTimesPlayed(){
        return timesPlayed;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public void setTimesPlayed(int timesPlayed){
        this.timesPlayed = timesPlayed;
    }
    public int compareTo(Song song){
        return Integer.compare(this.getDuration(),song.getDuration());
    }
    public String toString(){
        String song = "\n*************************************************"
        + "\nSong name: " + getTitle() + "\nArtist name: " + getArtist() +
        "\nAlbum name: " + getAlbum() + "\nDuration: " + getDuration()/60 + ":" + getDuration()%60 
        + "\nTimes played: " + getTimesPlayed(); 
        return song;
    }
    
}
