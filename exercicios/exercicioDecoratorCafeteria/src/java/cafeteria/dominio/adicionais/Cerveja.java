package cafeteria.dominio.adicionais;

import cafeteria.dominio.DecoracoesAdicionais;
import cafeteria.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Cerveja extends DecoracoesAdicionais {
    public Cerveja(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Cerveja";
    }

    public double cost() {
        return 500 + festa.cost();
    }
}
