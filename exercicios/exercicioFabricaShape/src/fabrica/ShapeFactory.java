package fabrica;

/**
 *
 * @author douglas
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        Shape shape;
        if (shapeType.equalsIgnoreCase("circulo")) {
            shape = new Circle();
        } else  if (shapeType.equalsIgnoreCase("quadrado")) {
            shape = new Square();
        } else {
            shape = new Triangle();
        }
        return shape;
    }
}
