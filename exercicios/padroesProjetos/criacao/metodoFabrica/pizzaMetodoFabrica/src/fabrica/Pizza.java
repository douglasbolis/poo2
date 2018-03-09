package fabrica;

public abstract class Pizza {
  protected String flavor;

  public void bake () {
    System.out.println( "Assando a pizza de " + this.flavor );
  }

  public void prepare () {
    System.out.println( "Preparando a pizza de " + this.flavor );
  }

  public void cut () {
    System.out.println( "Cortando a pizza de " + this.flavor );
  }

  public void box () {
    System.out.println( "Embalando a pizza de " + this.flavor );
  }
}
