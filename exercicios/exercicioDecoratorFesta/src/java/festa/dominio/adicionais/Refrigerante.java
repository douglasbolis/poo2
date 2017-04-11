package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Refrigerante extends DecoracoesAdicionais {
    public Refrigerante(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Refrigerante";
    }

    public double cost() {
        return 400 + festa.cost();
    }
}
