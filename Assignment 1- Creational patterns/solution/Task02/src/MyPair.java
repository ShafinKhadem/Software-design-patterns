class MyPair {
    private double first, second;

    MyPair(double first, double second) {
        this.first = first;
        this.second = second;
    }


    double getFirst() {
        return first;
    }

    double getSecond() {
        return second;
    }

    void printPair() {
        System.out.println(first + " X " + second);
    }
}
