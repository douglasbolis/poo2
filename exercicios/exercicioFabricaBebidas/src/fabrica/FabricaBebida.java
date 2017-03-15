package fabrica;

/**
 *
 * @author douglas
 */
public class FabricaBebida {
    public static Bebida createBebida(String classe) {
        Bebida bebida;
        Object classeReflection = null;

	try {
            classeReflection = Class.forName(classe).newInstance();
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	    e.printStackTrace();
	}
        bebida = (Bebida) classeReflection;
        return bebida;
    }
}
