package cadeia.responsabilidade.caixa;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Atm implements InterfaceAtm {
    ArrayList< Integer > notas;
    Atm() {
        notas = new ArrayList<>();
        notas.add(100);
        notas.add(50);
        notas.add(20);
        notas.add(10);
        notas.add(5);
        notas.add(2);
    }
    
    public ArrayList< Integer > executarSaque( Integer numero ) {
        return new ArrayList<>();
    }
}
