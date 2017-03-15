package fabrica;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main(String[] args) {
        Bebida bebida;

        bebida = FabricaBebida.createBebida("fabrica.Cafe");
        bebida.show();

        bebida = FabricaBebida.createBebida("fabrica.Cha");
        bebida.show();

        bebida = FabricaBebida.createBebida("fabrica.Refrigerante");
        bebida.show();

        bebida = FabricaBebida.createBebida("fabrica.Suco");
        bebida.show();
    }
}
