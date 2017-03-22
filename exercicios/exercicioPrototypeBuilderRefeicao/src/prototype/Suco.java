package prototype;

/**
 *
 * @author douglas
 */
public class Suco extends Bebida {
    public Suco(String sabor) {
        System.out.println("Cria suco com sabor: " + sabor);
        this.setSabor(sabor);
    }
}
