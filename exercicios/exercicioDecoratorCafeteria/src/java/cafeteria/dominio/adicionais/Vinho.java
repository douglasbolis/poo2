package cafeteria.dominio.adicionais;

import cafeteria.dominio.DecoracoesAdicionais;
import cafeteria.dominio.Festa;

/**
 *
 * @author douglas
 */
public class Vinho extends DecoracoesAdicionais {
    public Vinho(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Vinho";
    }

    public double cost() {
        return 800 + festa.cost();
    }
}
