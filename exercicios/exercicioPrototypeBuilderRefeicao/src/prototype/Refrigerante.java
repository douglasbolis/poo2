package prototype;

/**
 *
 * @author douglas
 */
public class Refrigerante extends Bebida {
    public Refrigerante(String sabor) {
        System.out.println("Cria refrigerante com sabor: " + sabor);
        this.setSabor(sabor);
    }
}
