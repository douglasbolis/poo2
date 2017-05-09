package cadeia.responsabilidade;

import cadeia.responsabilidade.caixa.Usuario;
import cadeia.responsabilidade.fronteira.Entrada;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main( String[] args ) {
        Usuario user;
        user = new Usuario( "João" );

        Entrada.leInt( "Qual o valor do saque?" );

        System.out.println( "Usuário " + user.getName() );
    }
}
