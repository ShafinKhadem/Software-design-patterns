import java.util.Scanner;

public class Problem1Client {
    public static Scanner in = new Scanner (System.in);
    
    public static void main (String[] args) {
        Subject abc = new Subject ();
        new PremiumObserver (abc);
        new RegularObserver (abc);
        while (true) {
            System.out.println ("Enter state: 0. operational 1. partially down 2. fully down");
            int newState = in.nextInt ();
            if (newState>2) break;
            abc.setState (newState);
        }
    }
}
