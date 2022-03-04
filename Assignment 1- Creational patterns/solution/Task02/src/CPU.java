class CPU {
    private double clockSpeed;          //in GHz
    private int numOfCores;

    CPU(double clockSpeed, int numOfCores) {
        this.clockSpeed = clockSpeed;
        this.numOfCores = numOfCores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public void printCPUSpecs() {
        System.out.println("Clock speed = " + clockSpeed);
        System.out.println("Number of cores = " + numOfCores);
    }
}
