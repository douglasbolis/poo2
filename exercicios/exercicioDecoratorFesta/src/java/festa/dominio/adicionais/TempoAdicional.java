package festa.dominio.adicionais;

import festa.dominio.DecoracoesAdicionais;
import festa.dominio.Festa;

/**
 *
 * @author douglas
 */
public class TempoAdicional extends DecoracoesAdicionais {
    public TempoAdicional(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Tempo adicional de 2 horas";
    }

    public double cost() {
        return 3000 + festa.cost();
    }
}
