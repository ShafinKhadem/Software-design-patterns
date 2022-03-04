class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        name = "Circle";
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 3.14159 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14159 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2.0 * radius;
    }
}
