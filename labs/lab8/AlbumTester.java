import java.util.*;
public class AlbumTester {
    public static void main(String[] args) {
        ArrayList <Track> tracks = new ArrayList<Track>();
        Scanner in = new Scanner(System.in);
        System.out.print("What is the title of the album? ");
        String albumTitle = in.nextLine();
        System.out.print("What is its price? ");
        double albumPrice = in.nextDouble();
        in.nextLine();
        Album album = new Album(albumTitle, albumPrice, tracks);
        boolean stop = false; 
        for(int i = 0; i<5 && !stop; i++){
            System.out.print("What is the title of the song? ");
            String songTitle = in.nextLine();
            System.out.print("How long is it in seconds? ");
            int songDuration = in.nextInt();
            System.out.println("Type OK to stop: ");
            String stopCode = in.next();
            in.nextLine();
            Track track = new Track(songTitle, songDuration);
            tracks.add(track);
            if(stopCode.equals("OK")){
                stop = true;
            }
        }
        System.out.println(album);
       
    }

}
