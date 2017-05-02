package cadeia.responsabilidade.caixa;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Usuario implements InterfaceAtm {
    String nome;
    Integer Dinheiro;
    Atm atm;
    
    Usuario( String nome ) {
        this.nome = nome;
        atm = new Atm();
    }
    
    public ArrayList< Integer > executarSaque( Integer numero ) {
        return atm.executarSaque( numero );
    }
}
