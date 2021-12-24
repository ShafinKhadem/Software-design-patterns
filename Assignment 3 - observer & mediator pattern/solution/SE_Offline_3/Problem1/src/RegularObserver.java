public class RegularObserver extends Observer {
    boolean def;
    
    public RegularObserver (Subject subject) {
        super (subject);
    }
    
    @Override
    public void update () {
        int newState = subject.getState ();
        if (lastState==0) {
            System.out.println ("Regular: 1. Continue our down service 2. Use DEF for full service");
            def = Problem1Client.in.nextInt ()==2;
        } else if (newState==0) {
            if (def) System.out.println ("Regular: Total bill: x");
            def = false;
        }
        lastState = newState;
    }
}
