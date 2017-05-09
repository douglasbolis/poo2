package cadeia.responsabilidade.fronteira;

import java.util.Scanner;

public class Entrada {
    public static Scanner reader = new Scanner( System.in );
    public static int leInt( String msg ) {
        Saida.println( msg );
        return reader.nextInt();
    }

    public static Double leDouble( String msg ) {
        Saida.println( msg );
        return reader.nextDouble();
    }

    public static String leString( String msg ) {
        Saida.println( msg );
        return reader.next();
    }
}
