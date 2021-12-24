import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List <Student> students;
    Examiner examiner;
    private List <Integer> marks;
    
    public Mediator () {
        students = new ArrayList <> ();
        marks = new ArrayList <> ();
    }
    
    void sendMark (List <Integer> _marks) {
        marks.addAll (_marks);
        for (int i = 0; i<5; i++) {
            System.out.println ("Student ID: "+(i+1)+" Mark: "+marks.get (i));
            students.get (i).notify (marks.get (i));
        }
    }
    
    void recheckRequest (int studentId) {
        System.out.println ("re-examine request got from student id "+studentId);
        examiner.recheck (studentId);
    }
    
    void updateMark (int studentId, int newMark) {
        System.out.println ("Updated marks got from examiner of ID "+studentId+": "+newMark);
        marks.set (studentId-1, newMark);
        students.get (studentId-1).notify (newMark);
    }
}
