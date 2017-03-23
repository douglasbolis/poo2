package builder.piscina;

/**
 *
 * @author douglas
 */
public class RectangularPoolBuilder extends PoolBuilder {
    public RectangularPoolBuilder(Pool pool) {
        this.pool = pool;
    }

    @Override
    protected void createBody() {
        System.out.println("Criando no formato retangular");
    }
}
