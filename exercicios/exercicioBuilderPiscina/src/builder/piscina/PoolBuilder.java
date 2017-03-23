package builder.piscina;

/**
 *
 * @author douglas
 */
public abstract class PoolBuilder {
    protected Pool pool;
    
    protected void paint(String color) {
        System.out.println("Pintando com a cor " + color);
        this.pool.setColor(color);
    }

    protected void antiLeak() {
        System.out.println("Aplicando tratamento anti vazamento");
        this.pool.setAntiLeak(true);
    }

    protected void addLadder() {
        System.out.println("Adicionado escada");

        if (this.pool instanceof RectangularPool) {
            ((RectangularPool)this.pool).setLadder(new Ladder());
        }
    }
    
    protected abstract void createBody();
}
