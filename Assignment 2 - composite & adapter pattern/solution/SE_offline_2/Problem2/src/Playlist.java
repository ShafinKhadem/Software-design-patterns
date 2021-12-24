import java.util.LinkedList;

public class Playlist {
    int start, duration;
    
    LinkedList <MediaFile> linkedList;
    
    public Playlist (int start) {
        this.start = start;
        duration = 0;
        linkedList = new LinkedList <> ();
    }
    
    void add (MediaFile x) {
        linkedList.add (x);
        duration += x.duration;
    }
    
    void display () {
        for (MediaFile i : linkedList) {
            System.out.println (i);
        }
    }
}
