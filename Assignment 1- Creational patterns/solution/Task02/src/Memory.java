class Memory {
    private double memorySize;      //in Mega Byte
    private int busSpeed;           //in MHz

    Memory(double memorySize, int busSpeed) {
        this.memorySize = memorySize;
        this.busSpeed = busSpeed;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public int getBusSpeed() {
        return busSpeed;
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }

    public void printMemorySpecs() {
        System.out.println("Memory Size = " + memorySize);
        System.out.println("Memory Bus Speed = " + busSpeed);
    }
}
