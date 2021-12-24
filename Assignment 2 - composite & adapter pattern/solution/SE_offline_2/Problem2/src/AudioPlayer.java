/**
 * @author Nafiur Rahman Khadem
 */
public class AudioPlayer implements MediaPlayer {
    Adapter adapter;
    Playlist current;
    
    @Override
    public void play (String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase ("mp3")) {
            System.out.println ("Playing mp3: "+fileName);
        } else if (mediaType.equalsIgnoreCase ("vlc")) {
            adapter = new Adapter ("vlc");
            adapter.play (mediaType, fileName);
        } else if (mediaType.equalsIgnoreCase ("mp4")) {
            adapter = new Adapter ("mp4");
            adapter.play (mediaType, fileName);
        }
    }
    
    void addPlaylist (int elapsedTime) {
        if (current==null || current.start+current.duration<=elapsedTime) {
            current = new Playlist (elapsedTime);
            System.out.println ("New playlist has been created at time "+elapsedTime);
        } else {
            System.out.println ("Sorry. A playlist is being played currently.");
        }
    }
    
    void addFile (MediaFile mediaFile) {
        if (current!=null) current.add (mediaFile);
        else System.out.println ("Add a playlist first");
    }
    
    void displayCurrent (int elapsedTime) {
        if (current==null || current.start+current.duration<=elapsedTime) {
            System.out.println ("No playlist is playing at the moment");
        } else {
            current.display ();
        }
    }
}
