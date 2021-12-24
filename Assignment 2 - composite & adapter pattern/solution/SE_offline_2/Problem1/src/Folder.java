/**
 * @author Nafiur Rahman Khadem
 */
public class Folder extends Component {
    public Folder (String name, String type) {
        super (name, type);
    }
    
    @Override
    void add (Component component) {
        if (component.type.equalsIgnoreCase ("Drive")) {
            System.out.println ("Only Root can contain drives as children");
        } else {
            children.add (component);
            component.parent = this;
            component.directory = directory+"/"+component.name;
        }
    }
}
