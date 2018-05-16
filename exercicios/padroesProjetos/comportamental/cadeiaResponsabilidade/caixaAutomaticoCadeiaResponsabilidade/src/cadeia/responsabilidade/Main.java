package cadeia.responsabilidade;

import cadeia.responsabilidade.caixa.*;
import cadeia.responsabilidade.fronteira.*;

/**
 *
 * @author douglas
 */
public class Main {
  public static void main( String[] args ) {
    String name = "João";
    Integer valorSaque;

    IAtmHandler c100 = new Cash100Handler();
    IAtmHandler c50 = new Cash50Handler();
    IAtmHandler c20 = new Cash20Handler();
    IAtmHandler c10 = new Cash10Handler();
    IAtmHandler c5 = new Cash5Handler();
    IAtmHandler c2 = new Cash2Handler();

    c100.setNextHandler( c50 );
    c50.setNextHandler( c20 );
    c20.setNextHandler( c10 );
    c10.setNextHandler( c5 );
    c5.setNextHandler( c2 );

    valorSaque = Entrada.leInt( "Qual o valor do saque? " );

    if ( valorSaque == 0 || valorSaque == 1 || valorSaque == 3 ) {
      Saida.println( "Impossível sacar R$ " + valorSaque + ",00 com as notas disponíveis." );
    } else {
      Saida.println( name + " sacou:" );
      c100.processHandler( valorSaque );
    }
  }
}
