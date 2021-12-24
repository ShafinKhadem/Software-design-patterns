/**
 * @author Nafiur Rahman Khadem
 */
public class File_ extends Component {
    public File_ (String name, String type) {
        super (name, type);
    }
    
    @Override
    void add (Component component) {
        System.out.println ("File cannot contain children");
    }
}
