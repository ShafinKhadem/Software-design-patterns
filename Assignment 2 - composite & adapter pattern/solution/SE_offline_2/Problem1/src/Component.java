import java.util.LinkedList;
import java.util.List;

/**
 * @author Nafiur Rahman Khadem
 */
public abstract class Component {
    String name, type, directory;
    List <Component> children;
    Component parent;
    
    public Component (String name, String type) {
        this.name = name;
        this.type = type;
        directory = name;
        children = new LinkedList <> ();
        parent = null;
    }
    
    abstract void add (Component component);
    
    void remove () {
        while (!children.isEmpty ()) {
            children.get (0).remove ();
        }
        
        if (parent==null) {
            System.out.println ("You can't remove root");
        } else {
            parent.children.remove (this);
            System.out.println ("Removing "+directory);
        }
    }
    
    Component find (String dir) {
        if(directory.equals (dir)) return this;
        for (Component i : children) {
            Component ret = i.find (dir);
            if(ret!=null) return ret;
        }
        return null;
    }
    
    void list (String prefix) {
        System.out.println (prefix+name);
        if(prefix.isEmpty ()) prefix = "----";
        else prefix = "----"+prefix;
        for (Component i : children) {
            i.list (prefix);
        }
    }
    
    int component_count () {
        int ret = type.equalsIgnoreCase ("File") ? 1 : 0;
        for (Component i : children) {
            ret += i.component_count ();
        }
        return ret;
    }
    
    void details () {
        System.out.println ("Name: "+name);
        System.out.println ("Type: "+type);
        System.out.println ("Directory: "+directory);
        System.out.println ("Component Count: "+component_count ());
    }
}
