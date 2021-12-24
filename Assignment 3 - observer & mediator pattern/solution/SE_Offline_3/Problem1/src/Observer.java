public abstract class Observer {
    protected int lastState;
    protected Subject subject;
    
    public Observer (Subject subject) {
        this.subject = subject;
        this.subject.attach (this);
        lastState = subject.getState ();
    }
    
    public abstract void update ();
}
