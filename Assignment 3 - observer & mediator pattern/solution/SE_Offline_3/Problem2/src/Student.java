public class Student {
    Mediator mediator;
    int id;
    
    public Student (Mediator mediator) {
        this.mediator = mediator;
        mediator.students.add (this);
        this.id = mediator.students.size ();
    }
    
    void notify (int mark) {
        System.out.println ("Student "+id+" has got mark: "+mark);
    }
    
    void recheckRequest () {
        System.out.println ("re-examine request sent from student id "+id);
        mediator.recheckRequest (id);
    }
}
