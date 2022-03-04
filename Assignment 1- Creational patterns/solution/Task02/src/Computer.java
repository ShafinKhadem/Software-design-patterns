abstract class Computer {
    String type;
    CPU cpu;
    Memory memory;
    MyPair resolution;

    void printResolution() {
        System.out.print("Resolution : ");
        resolution.printPair();
    }

    public MyPair getResolution() {
        return resolution;
    }

    void printComputerSpecs() {
        System.out.println("Type = "+type);
        cpu.printCPUSpecs();
        memory.printMemorySpecs();
        resolution.printPair();
    }

}
