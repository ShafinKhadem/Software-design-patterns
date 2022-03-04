class ComputerB extends Computer{

    public ComputerB() {
        type = "ComputerB";
        cpu = new CPU(2.7, 4);
        memory = new Memory(1024, 1300);
        resolution = new MyPair(350, 250);
    }

}
