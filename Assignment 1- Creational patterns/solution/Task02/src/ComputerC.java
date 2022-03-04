class ComputerC extends Computer{

    public ComputerC() {
        type = "ComputerC";
        cpu = new CPU(3.0, 4);
        memory = new Memory(2048, 1600);
        resolution = new MyPair(550, 430);
    }

}
