package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Banda extends DecoracoesAdicionais {
    public Banda(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Banda";
    }

    public double cost() {
        return 3000 + festa.cost();
    }
}
