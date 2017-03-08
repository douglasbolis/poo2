package fabrica;

/**
 *
 * @author douglas
 */
public class CobrancaTim implements ICobranca {
    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via tim");
    }
}
