public class PremiumObserver extends Observer {
    boolean doubleServer;
    
    public PremiumObserver (Subject subject) {
        super (subject);
    }
    
    @Override
    public void update () {
        int newState = subject.getState ();
        if (lastState==0) {
            if (newState==1) {
                System.out.println ("Premium: Take service from both servers? 1. Yes 2. No");
                doubleServer = Problem1Client.in.nextInt ()==1;
            } else if (newState==2) {
                System.out.println ("Premium: Service is now provided by DEF company");
            } 
        } else if (lastState==1) {
            if (newState==2 && doubleServer) System.out.println ("Premium: All the services are copied to DEF");
            doubleServer = false;
        }
        lastState = newState;
    }
}
