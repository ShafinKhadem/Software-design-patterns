class CompatibilityChecker {

    public static boolean checkCompatibility(Computer computer, Object shape) {
        MyPair res = computer.getResolution();
        double first = res.getFirst(), second = res.getSecond();

        if(shape instanceof Circle) {
            Circle circle = (Circle) shape;
            double diameter = circle.getDiameter();
            return diameter <= first && diameter <= second;
        }
        else if(shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLength() <= first && rectangle.getBreadth() <= second;
        }
        else if(shape instanceof Square) {
            Square square = (Square) shape;
            return square.getSide() <= first && square.getSide() <= second;
        }
        else if(shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            return triangle.getLargestSide() <= first &&
                    triangle.getSecondLargestSide() <= second;
        }
        else {
            System.out.println("Unrecognized Shape!!!");
            return false;
        }
    }

}
