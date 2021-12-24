import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2Client {
    static Scanner in = new Scanner (System.in);
    
    public static void main (String[] args) {
        Mediator mediator = new Mediator ();
        Examiner examiner = new Examiner (mediator);
        List <Student> students = new ArrayList <> ();
        for (int i = 0; i<5; i++) {
            students.add (new Student (mediator));
        }
        examiner.sendMark ();
        for (int i = 0; i<5; i++) {
            System.out.println ("Recheck for student "+(i+1)+"? 1. Yes 2. No");
            if (in.nextInt ()==1) students.get (i).recheckRequest ();
        } 
    }
}
