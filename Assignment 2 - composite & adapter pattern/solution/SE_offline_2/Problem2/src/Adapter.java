/**
 * @author Nafiur Rahman Khadem
 */
public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public Adapter (String mediaType) {
        if (mediaType.equalsIgnoreCase ("vlc")) advancedMediaPlayer = new VlcPlayer ();
        else if (mediaType.equalsIgnoreCase ("mp4")) advancedMediaPlayer = new Mp4Player ();
    }
    
    @Override
    public void play (String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase ("vlc")) advancedMediaPlayer.playVlc (fileName);
        else if (mediaType.equalsIgnoreCase ("mp4")) advancedMediaPlayer.playMp4 (fileName);
    }
}
