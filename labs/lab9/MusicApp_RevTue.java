import java.util.*;
public class MusicApp_RevTue {
    public static void main(String[] args) {
        
    
        String menu = "--------------------------------------------------------" + 
        "\nWelcome to Music App! Get Ready to create your playlist!" + 
        "\n--------------------------------------------------------" +
        "\n1 - Create a new Playlist" + "\n2 - Display the Playlist" + 
        "\n3 - Sort the Playlist" + "\n4 - Remove song by index from the current Playlist" +
        "\n5 - Display all Playlists" + "\n6 - Sort the playlists" + "\n7 - Exit";
        ArrayList<String> genres = new ArrayList<String>();
        genres.add("0-Country"); genres.add("1-Electronic"); genres.add("2-Pop Music"); 
        genres.add("3-Rock Music"); genres.add("4-Jazz"); genres.add("5-Classical");
        Scanner in = new Scanner(System.in);
        Playlist_RevTue playlist = new Playlist_RevTue();
        String genre = ""; String creatorName = ""; String playlistName = "";
        ArrayList<Song> songs = new ArrayList<Song>();
        int decision = 0;
        ArrayList <Playlist_RevTue> allPlaylists = new ArrayList<Playlist_RevTue>(); // avoid same reference playlist 
        do{
            System.out.println(menu);
            decision = in.nextInt();
        if(decision == 1){
            songs = new ArrayList<Song>();
            System.out.println("How many songs do you want to add to playlist?");
            int numberOfSongs = in.nextInt();
            in.nextLine();
            for(int i = 1; i<numberOfSongs+1; i++){
                System.out.println("Enter the artist name for Song " +i);
                String artistName = in.nextLine();
                System.out.println("Enter the album name for Song " +i);
                String albumName = in.nextLine();
                System.out.println("Enter song name for Song " +i);
                String songName = in.nextLine();
                System.out.println("Enter song duration in seconds for Song " +i);
                int songDuration = in.nextInt();
                System.out.println("Enter the times song has been played for Song " +i);
                int songPlayed = in.nextInt();
                in.nextLine();
                Song song = new Song(songName, artistName, albumName, songDuration, songPlayed);
                songs.add(song);
            }
            System.out.println("Enter playlist name: ");
            playlistName = in.nextLine();
            System.out.println("Enter creator of playlist: ");
            creatorName = in.nextLine();
            for(int i = 0; i<genres.size(); i++){
                System.out.println(genres.get(i));
            }
            System.out.println("Select genre of playlist: "); //ie: Electronic  pick number? in.nextInt()  if .. electronic
            genre = in.nextLine();
            playlist = new Playlist_RevTue(playlistName, creatorName, genre, songs );
            allPlaylists.add(playlist);
        }
        if(decision == 2){
            System.out.println(playlist);
        }
        if(decision == 3){
            System.out.println("Sorted playlists: ");
            playlist.sortByDurationDesc(songs);
            System.out.println(playlist);
        }
        if(decision == 4){
            System.out.println("Which song do you want to remove? (index)");
            int removeSong = in.nextInt();
            songs.remove(removeSong);
            System.out.println(menu);
            decision = in.nextInt();
            if(decision == 2){
                System.out.println(playlist);
            }
        }
        if(decision == 5){  
            System.out.println("All playlists: ");
            System.out.println();
            System.out.println(allPlaylists);
        }
        if(decision == 6){ // song number equal not work
            System.out.println("Sorted playlists: ");
            playlist.sortPlaylists(allPlaylists);
            System.out.println(allPlaylists);
        }
    }
    while(decision != 7);
        if(decision == 7){
            System.out.println("BYE!");
        }
        
    }
}
