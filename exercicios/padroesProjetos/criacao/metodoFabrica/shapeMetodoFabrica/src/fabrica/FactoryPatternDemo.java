package fabrica;

public class FactoryPatternDemo {
  public static void main( String[] args ) {
    ShapeFactory shapeFactory = new ShapeFactory();
    IShape shape = null;

    shape = shapeFactory.getShape( "circle" );
    shape.draw();

    shape = shapeFactory.getShape( "triangle" );
    shape.draw();

    shape = shapeFactory.getShape( "square" );
    shape.draw();
  }
}
