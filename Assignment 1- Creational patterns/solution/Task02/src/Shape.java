abstract class Shape {
    String name;
    abstract double getSurfaceArea();
    abstract double getPerimeter();
    public void printName() {
        System.out.println("The shape is a " + name);
    }
}
