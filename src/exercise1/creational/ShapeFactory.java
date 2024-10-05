package exercise1.creational;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
