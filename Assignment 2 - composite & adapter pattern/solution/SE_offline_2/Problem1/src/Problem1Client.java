import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * @author Nafiur Rahman Khadem
 */
public class Problem1Client {
    static Scanner in;
    public static void main (String[] args) {
        try {
            in = new Scanner (new File ("Problem1/src/input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println ("File not found");
            in = new Scanner (System.in);
        }
    
        Root root = new Root ();
        String prv = root.directory;
        while (true) {
            System.out.println ("Create 1. Drive 2. Folder 3. File\n4.Remove 5. List 6.Details");
            int t = in.nextInt ();
            if (t >= 1 && t<=3) {
                System.out.println ("Enter name");
                String s = in.next ();
                Component component, parent;
                if (t==1) {
                    component = new Drive (s, "Drive");
                    parent = root;
                } else {
                    component = t==2 ? new Folder (s, "Folder") : new File_ (s, "File");
                    parent = null;
                    while (parent==null) {
                        System.out.println ("Enter parent directory");
                        String p = in.next ();
                        if (p.equals ("$")) p = prv;
                        parent = root.find (p);
                        if (parent==null) System.out.println ("Your given parent directory does not exist");
                    }
                }
                parent.add (component);
                if (t==1 || t==2) prv = component.directory;
                System.out.println ("Created: "+prv);
            } else if (t >= 4 && t<=6) {
                System.out.println ("Enter directory");
                String s = in.next ();
                Component component = root.find (s);
                if (component==null) System.out.println ("Your given directory does not exist");
                else {
                    if (t==4) component.remove ();
                    else if (t==5) component.list ("");
                    else component.details ();
                }
            } else {
                break;
            }
        }
    
        in.close ();
    }
}
