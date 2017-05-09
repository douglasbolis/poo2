package cadeia.responsabilidade;

import cadeia.responsabilidade.caixa.QtdCedula;
import cadeia.responsabilidade.caixa.Usuario;
import cadeia.responsabilidade.fronteira.Entrada;
import cadeia.responsabilidade.fronteira.Saida;
import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main( String[] args ) {
        Usuario user = new Usuario( "João" );
        Integer valorSaque;
        ArrayList< QtdCedula > cedulas;

        valorSaque = Entrada.leInt( "Qual o valor do saque?" );
        cedulas = user.executarSaque( valorSaque );

        Saida.println( "Usuário " + user.getName() );
        Saida.println( "Sacou:" );
        for ( QtdCedula obj : cedulas ) {
            Saida.println( obj.getQtd() + " nota(s) de R$ " + obj.getCedula() + ",00." );
        }
    }
}
