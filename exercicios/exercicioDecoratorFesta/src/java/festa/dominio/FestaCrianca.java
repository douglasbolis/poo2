package festa.dominio;

/**
 *
 * @author douglas
 */
public class FestaCrianca extends Festa {
    public FestaCrianca() {
        description = "Festa de Criaça";
    }

    public double cost() {
        return 5000;
    }
}
