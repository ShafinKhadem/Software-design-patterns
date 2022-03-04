class ComputerFactory {

    public static Computer getComputer(String type) {

        if (type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("ComputerA")) {
            return new ComputerA();
        }
        else if(type.equalsIgnoreCase("ComputerB")) {
            return new ComputerB();
        }
        else if(type.equalsIgnoreCase("ComputerC")) {
            return new ComputerC();
        }
        else {
            System.out.println("Unrecognized Computer Type!!!");
            return null;
        }
    }

}
