package fabrica;

public class ShapeFactory {
  public IShape getShape ( String shapeType ) {
    IShape shape = null;

    if ( shapeType.equalsIgnoreCase( "circle" ) ) {
			shape = new Circle();
		} else
		if ( shapeType.equalsIgnoreCase( "triangle" ) ) {
			shape = new Triangle();
		} else
		if ( shapeType.equalsIgnoreCase( "square" ) ) {
			shape = new Square();
    }

    return shape;
  }
}
