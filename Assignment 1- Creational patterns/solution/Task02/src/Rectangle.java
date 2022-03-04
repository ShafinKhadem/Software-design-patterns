class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        name = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getSurfaceArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (length + breadth);
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}
