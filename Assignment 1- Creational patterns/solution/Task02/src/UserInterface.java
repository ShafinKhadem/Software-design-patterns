import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class UserInterface {

    public static void create() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To start a session type 'S'.");
            System.out.println("To exit the UI type 'Exit'");
            System.out.print("Your choice: ");
            String string = scanner.nextLine();
            if(string.equalsIgnoreCase("S")) {
                session();
            }
            else if(string.equalsIgnoreCase("exit")) {
                break;
            }
            else {
                System.out.println("Invalid choice. Try again!!!\n");
            }
        }
    }

    private static void session() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To choose a machine, type its number.");
        System.out.println("Available Machines: ");
        System.out.println("1. ComputerA");
        System.out.println("2. ComputerB");
        System.out.println("3. ComputerC");
        System.out.print("Your choice: ");
        int choice = -1;

        try {
            choice = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception ignored) {
            System.out.println("Invalid choice!!!");
        }
        Computer computer = null;

        if(choice == -1) {
            System.out.println("Session Failed!!!\n");
            return;
        }
        else if(choice == 1) {
            computer = ComputerFactory.getComputer("ComputerA");
        }
        else if (choice == 2) {
            computer = ComputerFactory.getComputer("ComputerB");
        }
        else if (choice == 3) {
            computer = ComputerFactory.getComputer("ComputerC");
        }

        if (computer == null) {
            System.out.println("Invalid choice.\nSession Failed!!!\n");
            return;
        }

        System.out.println("To choose a shape, type its number.");
        System.out.println("Available Shapes: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Your choice: ");

        try {
            choice = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception ignored) {
            System.out.println("Invalid choice");
        }

        Shape shape = null;

        if(choice == -1) {
            System.out.println("Session Failed!!!\n");
            return;
        }
        else if(choice == 1) {
            double radius = -1.0;
            System.out.print("Please enter radius: ");
            try {
                radius = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid radius!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            if(radius == -1.0) {
                System.out.println("Session Failed!!!\n");
                return;
            }
            shape = new Circle(radius);
        }
        else if(choice == 2) {
            double side = -1.0;
            System.out.print("Please enter the length of the side: ");
            try {
                side = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid side length!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            if(side == -1.0) {
                System.out.println("Session Failed!!!\n");
                return;
            }
            shape = new Square(side);
        }
        else if(choice == 3) {
            double length = -1.0, breadth = -1.0;
            System.out.print("Please enter the length: ");
            try {
                length = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid length!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            System.out.print("Please enter the breadth: ");
            try {
                breadth = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid breadth!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }

            if(length == -1.0 || breadth == -1.0) {
                System.out.println("Session Failed!!!\n");
                return;
            }
            shape = new Rectangle(length, breadth);
        }
        else if(choice == 4) {
            double sideA = -1.0, sideB = -1.0, sideC = -1.0;
            System.out.print("Please enter the length of the first side: ");
            try {
                sideA = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid length!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            System.out.print("Please enter the length of the second side: ");
            try {
                sideB = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid length!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            System.out.print("Please enter the length of the third side: ");
            try {
                sideC = Double.parseDouble(scanner.nextLine());
            }
            catch (Exception ignored) {
                System.out.println("Invalid length!!!");
                System.out.println("Session Failed!!!\n");
                return;
            }
            if(sideA == -1.0 || sideB == -1.0 || sideC == -1.0) {
                System.out.println("Session Failed!!!\n");
                return;
            }
            shape = new Triangle(sideA, sideB, sideC);
        }

        if (shape == null) {
            System.out.println("Invalid choice.\nSession Failed!!!\n");
            return;
        }

        boolean compatible =
                CompatibilityChecker.checkCompatibility(computer, shape);

        if (!compatible) {
            System.out.println("Shape size is too large for the machine.");
            System.out.println("Session Failed!!!\n");
        }
        else {
            System.out.println("Your session details are as follows:");
            shape.printName();
            computer.printResolution();
            System.out.println("The surface area is = "
                    + shape.getSurfaceArea());
            System.out.println("The perimeter is = " + shape.getPerimeter());
            System.out.println();
        }
    }
}
