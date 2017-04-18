package cafeteria.dominio.adicionais;

import cafeteria.dominio.DecoracoesAdicionais;
import cafeteria.dominio.Festa;

/**
 *
 * @author douglas
 */
public class AguadeCoco extends DecoracoesAdicionais {
    public AguadeCoco(Festa festa) {
        this.festa = festa;
    }

    @Override
    public String getDescription() {
        return festa.getDescription() + ", Agua de Coco";
    }

    public double cost() {
        return 200 + festa.cost();
    }
}
