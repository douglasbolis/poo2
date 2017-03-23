package builder.piscina;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main(String[] args) {
        PoolDirector director = new PoolDirector();

        System.out.println("\nPiscina redonda");
        RoundPool roundPool = director.prepareRoundPool();

        System.out.println("\nPiscina retangular");
        RectangularPool retangularPool = director.prepareRectangularPool();

        System.out.println("\nPiscina hexagonal");
        HexagonalPool hexagonalPool = director.prepareHexagonalPool();
    }
}
