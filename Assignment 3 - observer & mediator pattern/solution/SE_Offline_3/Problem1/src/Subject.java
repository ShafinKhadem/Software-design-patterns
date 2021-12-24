import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List <Observer> observers;
    private int state;
    
    public Subject () {
        observers = new ArrayList <> ();
        state = 0;
    }
    
    public int getState () {
        return state;
    }
    
    public void setState (int state) {
        if (this.state==state) return;
        this.state = state;
        notifyAllObservers ();
    }
    
    public void attach (Observer observer) {
        observers.add (observer);
    }
    
    public void notifyAllObservers () {
        for (Observer i : observers) {
            i.update ();
        }
    }
}
