package fabrica;

/**
 *
 * @author douglas
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape;

        shape = ShapeFactory.getShape("circulo");
        shape.draw();

        shape = ShapeFactory.getShape("quadrado");
        shape.draw();

        shape = ShapeFactory.getShape("triangulo");
        shape.draw();
    }
}
