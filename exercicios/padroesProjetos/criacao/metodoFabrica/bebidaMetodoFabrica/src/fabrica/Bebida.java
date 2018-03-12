package fabrica;

public abstract class Bebida {
  protected String flavor;
  protected String type;
  protected void make () {
    System.out.println( "Preparado " + this.type + " sabor " + this.flavor );
  }
}
