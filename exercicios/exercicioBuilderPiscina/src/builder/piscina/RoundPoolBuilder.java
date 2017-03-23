package builder.piscina;

/**
 *
 * @author douglas
 */
public class RoundPoolBuilder extends PoolBuilder {
    public RoundPoolBuilder(Pool pool) {
        this.pool = pool;
    }

    @Override
    protected void createBody() {
        System.out.println("Criando no formato redondo");
    }
}
