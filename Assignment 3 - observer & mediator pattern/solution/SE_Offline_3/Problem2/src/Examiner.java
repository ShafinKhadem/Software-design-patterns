import java.util.ArrayList;
import java.util.List;

public class Examiner {
    Mediator mediator;
    int wrong;
    
    public Examiner (Mediator mediator) {
        this.mediator = mediator;
        mediator.examiner = this;
        wrong = (int) (Math.random ()*3);
    }
    
    void sendMark () {
        System.out.println ("scripts and marks of student id 1,2,3,4,5 sent to exam controller office");
        List <Integer> marks = new ArrayList <> ();
        for (int i = 0; i<5; i++) {
            marks.add ((int) (Math.random ()*100));
        }
        mediator.sendMark (marks);
    }
    
    void recheck (int studentID) {
        System.out.println ("Examiner got recheck request of ID "+studentID);
        if (studentID%3!=wrong) return;
        int newMark = (int) (Math.random ()*100);
        System.out.println ("Examiner sending updated mark of ID "+studentID+": "+newMark);
        mediator.updateMark (studentID, newMark);
    }
}
