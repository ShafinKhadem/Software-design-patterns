public class MediaFile {
    String name, type;
    int size, duration;
    
    public MediaFile (String name, String type, int size, int duration) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.duration = duration;
    }
    
    @Override
    public String toString () {
        return "MediaFile{"+"name='"+name+'\''+", type='"+type+'\''+", size="+size+", duration="+duration+'}';
    }
}
