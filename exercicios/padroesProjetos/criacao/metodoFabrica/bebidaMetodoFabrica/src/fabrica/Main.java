package fabrica;

public class Main {
  public static void main(String[] args) {
    FabricaBebida fabricaBebida = new FabricaBebida();
    Bebida bebida = fabricaBebida.pedirBebida( "suco", "laranja" );
    bebida.make();
  }
}