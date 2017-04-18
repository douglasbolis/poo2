package cafeteria.dominio.adicionais;

import cafeteria.dominio.DecoracoesAdicionais;
import cafeteria.dominio.Festa;

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
