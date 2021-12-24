import java.util.Scanner;

public class Problem2Client {
    static Scanner in;
    public static void main (String[] args) {
        in = new Scanner (System.in);
        AudioPlayer audioPlayer = new AudioPlayer ();
        audioPlayer.play ("mp3", "mp3File.mp3");
        audioPlayer.play ("mp4", "mp4File.mp4");
        audioPlayer.play ("vlc", "vlcFile.vlc");
        while (true) {
            System.out.println ("1. Add playlist 2. Display current playlist 3. Add file to current playlist");
            int t = in.nextInt ();
            if (t==1) {
                System.out.println ("Enter current time");
                int elapsed = in.nextInt ();
                audioPlayer.addPlaylist (elapsed);
            } else if (t==2) {
                System.out.println ("Enter current time");
                int elapsed = in.nextInt ();
                audioPlayer.displayCurrent (elapsed);
            } else if (t==3) {
                System.out.println ("Enter name type size duration");
                String name = in.next (), type = in.next ();
                int size = in.nextInt (), duration = in.nextInt ();
                MediaFile mediaFile = new MediaFile (name, type, size, duration);
                audioPlayer.addFile (mediaFile);
            } else {
                break;
            }
        }
    }
}
