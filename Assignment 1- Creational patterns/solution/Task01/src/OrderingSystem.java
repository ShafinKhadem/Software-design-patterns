import java.util.ArrayList;
import java.util.Scanner;

class OrderingSystem {

    static void order() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nTo start an order type 'O'.");
            System.out.println("To exit the ordering system, type 'Exit'.");
            System.out.print("Your choice: ");
            String string = scanner.nextLine();
            if(string.equalsIgnoreCase("O")) {
                System.out.println("Starting Order...");
                shakeOrder();
            }
            else if(string.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                System.out.println("Unrecognized command!!! Try again.");
            }
        }
    }

    private static void shakeOrder() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Shake> shakes = new ArrayList<>();

        while (true) {
            System.out.println("\nTo end the order type 'E'");
            System.out.println("To order a shake type its number:");
            System.out.println("1. Chocolate Shake");
            System.out.println("2. Coffee Shake");
            System.out.println("3. Strawberry Shake");
            System.out.println("4. Vanilla Shake");
            System.out.println("5. Zero Shake");
            System.out.print("Your order: ");
            String string = scanner.nextLine();
            int shakerNumber = -1;
            try {
                shakerNumber = Integer.parseInt(string);
            }
            catch (Exception ignored) {

            }

            if(string.equalsIgnoreCase("E")) {
                if(shakes.size()==0) {
                    System.out.println("\nPlease order at least one shake before closing the order!!!\n");
                }
                else {
                    shakePrinter(shakes);
                    break;
                }
            }
            else if(string.equalsIgnoreCase("O")) {
                System.out.println("\nCan not start new order before closing current order!!!");
                System.out.println("Do you want to add anything to your current order?\n");
            }
            else {
                Shake shake = createShake(shakerNumber);
                if(shake != null) {
                    shakes.add(shake);
                    System.out.println("Shake Ordered!!!\n");
                }
            }

        }

    }

    private static Shake createShake(int shakeNumber) {

        Scanner scanner = new Scanner(System.in);
        String shake = null;
        System.out.println("Do you want to make your shake lactose free?");
        System.out.println("Type 'Yes' or 'No'");
        System.out.print("Your choice: ");
        String lactoseFreeChecker = scanner.next();
        boolean lactoseFree;
        if (lactoseFreeChecker.equalsIgnoreCase("Yes")) {
            lactoseFree = true;
        }
        else if(lactoseFreeChecker.equalsIgnoreCase("No")) {
            lactoseFree = false;
        }
        else {
            System.out.println("Invalid selection!!! Try again.");
            return null;
        }

        System.out.println("Do you want toppings on your shake?");
        System.out.println("Type 'Yes' or 'No'");
        System.out.print("Your choice: ");
        String toppingChecker = scanner.next();
        int topping = 0;
        if (toppingChecker.equalsIgnoreCase("Yes")) {
            System.out.println("To add a topping type its number:");
            System.out.println("1. Candy");
            System.out.println("2. Cookie");
            try{
                topping = Integer.parseInt(scanner.next());
            }
            catch (Exception ignored){
            }
            if(topping<1 || topping>2) {
                System.out.println("Invalid selection!!! Try again.");
                return null;
            }
        }
        else if(!toppingChecker.equalsIgnoreCase("No")) {
            System.out.println("Invalid selection!!! Try again.");
            return null;
        }

        if(shakeNumber==1) {
            shake = "Chocolate Shake";
        }
        else if(shakeNumber==2) {
            shake = "Coffee Shake";

        }
        else if(shakeNumber==3) {
            shake = "Strawberry Shake";

        }
        else if(shakeNumber==4) {
            shake = "Vanilla Shake";

        }
        else if(shakeNumber==5) {
            shake = "Zero Shake";
        }


        return ShakeFactory.getShake(shake, lactoseFree, topping);

    }


    private static void shakePrinter(ArrayList<Shake> shakes) {
        System.out.println("\nYour order is as follows:");
        for (int i=0; i<shakes.size(); i++)
        {
            System.out.print("Shake - "+ (i + 1) + ":");
            shakes.get(i).printShake();
        }
    }
}
