class ComputerA extends Computer{

    public ComputerA() {
        type = "ComputerA";
        cpu = new CPU(2.4, 2);
        memory = new Memory(512, 800);
        resolution = new MyPair(200, 200);
    }

}
