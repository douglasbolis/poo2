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

        AtmHandler c100 = new Cash100Handler( 100 );
        AtmHandler c50 = new Cash50Handler( 50 );
        AtmHandler c20 = new Cash20Handler( 20 );
        AtmHandler c10 = new Cash10Handler( 10 );
        AtmHandler c5 = new Cash5Handler( 5 );
        AtmHandler c2 = new Cash2Handler( 2 );

        c100.setNextHandler( c50 );
        c50.setNextHandler( c20 );
        c20.setNextHandler( c10 );
        c10.setNextHandler( c5 );
        c5.setNextHandler( c2 );

        valorSaque = Entrada.leInt( "Qual o valor do saque? " );
        
        Saida.println( name + " sacou:" );
        c100.processHandler( valorSaque );
    }
}
