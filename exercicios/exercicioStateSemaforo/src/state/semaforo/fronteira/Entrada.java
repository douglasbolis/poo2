package state.semaforo.fronteira;

import java.util.Scanner;

/**
 *
 * @author douglas
 */
public class Entrada {
    public static Scanner reader = new Scanner( System.in );
    public static int leInt( String msg ) {
        Saida.print( msg );
        return reader.nextInt();
    }

    public static Double leDouble( String msg ) {
        Saida.print( msg );
        return reader.nextDouble();
    }

    public static String leString( String msg ) {
        Saida.print( msg );
        return reader.next();
    }
}
