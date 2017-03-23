package builder.piscina;

/**
 *
 * @author dougals
 */
public class HexagonalPoolBuilder extends PoolBuilder {
    public HexagonalPoolBuilder(Pool pool) {
        this.pool = pool;
    }

    @Override
    protected void createBody() {
        System.out.println("Criando no formato Hexagonal");
    }
}
