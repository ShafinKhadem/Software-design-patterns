class Triangle extends Shape {

    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        name = "Triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getSurfaceArea() {
        double s = (sideA + sideB + sideC)/2.0;
        return Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getLargestSide() {
        return Math.max(sideA, Math.max(sideB, sideC));
    }

    public double getSecondLargestSide() {
        return sideA+sideB+sideC-getLargestSide()+-getShortestSide();
    }

    public double getShortestSide() {
        return Math.min(sideA, Math.min(sideB, sideC));
    }
}
