package fabrica;

/**
 *
 * @author douglas
 */
public class CobrancaVivo implements ICobranca {
    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via vivo");
    }
}
