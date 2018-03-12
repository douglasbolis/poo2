package fabrica;

public class FabricaBebida {
  private BebidaFactory bebidaFactory;
  public FabricaBebida () {
    this.bebidaFactory = new BebidaFactory();
  }
  public Bebida pedirBebida ( String type, String flavor ) {
    return this.bebidaFactory.createBebida( type, flavor );
  }
}