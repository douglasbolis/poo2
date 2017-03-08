package fabrica;

/**
 *
 * @author douglas
 */
public class CobrancaClaro implements ICobranca {
    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via claro");
    }
}
