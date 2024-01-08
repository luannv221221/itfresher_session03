package demo.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
