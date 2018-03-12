package fabrica;

public class BebidaFactory {
  public Bebida createBebida ( String typeBebida, String flavor ) {
    Bebida bebida = null;

    if ( typeBebida.equalsIgnoreCase( "cafe" ) ) {
      bebida = new Cafe( flavor );
    } else
    if ( typeBebida.equalsIgnoreCase( "cha" ) ) {
      bebida = new Cha( flavor );
    } else
    if ( typeBebida.equalsIgnoreCase( "suco" ) ) {
      bebida = new Suco( flavor );
    } else
    if ( typeBebida.equalsIgnoreCase( "refrigerante" ) ) {
      bebida = new Refrigerante( flavor );
    }

    return bebida;
  }
}
