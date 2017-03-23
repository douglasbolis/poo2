package builder.piscina;

/**
 *
 * @author douglas
 */
public class PoolDirector {
    public RoundPool prepareRoundPool() {
        System.out.println("Criando piscina redonda");

        RoundPool pool = new RoundPool();
        RoundPoolBuilder builder = new RoundPoolBuilder(pool);

        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();

        return pool;
    }
    
    public RectangularPool prepareRectangularPool() {
        System.out.println("Criando piscina retangular");

        RectangularPool pool = new RectangularPool();
        RectangularPoolBuilder builder = new RectangularPoolBuilder(pool);

        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();
        builder.addLadder();

        return pool;
    }
    
    public HexagonalPool prepareHexagonalPool() {
        System.out.println("Criando piscina hexagonal");

        HexagonalPool pool = new HexagonalPool();
        HexagonalPoolBuilder builder = new HexagonalPoolBuilder(pool);

        builder.createBody();
        builder.paint("azul");
        builder.antiLeak();

        return pool;
    }
}
