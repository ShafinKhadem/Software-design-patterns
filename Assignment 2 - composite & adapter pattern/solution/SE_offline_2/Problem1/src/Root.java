/**
 * @author Nafiur Rahman Khadem
 */
public class Root extends Component {
    public Root () {
        super ("/", "Root");
    }
    
    @Override
    void add (Component component) {
        if (component.type.equalsIgnoreCase ("Drive")) {
            children.add (component);
            component.parent = this;
        } else {
            System.out.println ("Root can only contain drives as children");
        }
    }
}
