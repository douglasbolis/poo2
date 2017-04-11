package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Dj extends DecoracoesAdicionais {
    public Dj(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", DJ";
    }

    public double cost() {
        return 1500 + festa.cost();
    }
}
