package exercise1.creational;

public class FactoryPatternDemo {

	public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        
        Shape shape1 = factory.createShape("Circle");
        shape1.draw(); // Drawing a Circle

        Shape shape2 = factory.createShape("Square");
        shape2.draw(); // Drawing a Square

	}

}
