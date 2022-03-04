class Square extends Shape {
    private double side;

    public Square(double side) {
        name = "Square";
        this.side = side;
    }

    @Override
    public double getSurfaceArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }
}
