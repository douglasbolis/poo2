package cafeteria.dominio.adicionais;

import cafeteria.dominio.DecoracoesAdicionais;
import cafeteria.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Flores extends DecoracoesAdicionais {
    public Flores(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Flores";
    }

    public double cost() {
        return 200 + festa.cost();
    }
}
