package fabrica;

/**
 *
 * @author douglas
 */
public class ClamPizza extends Pizza {
    private static String sabor = "pizza de frutos do mar";
    @Override
    public void bake() {
        System.out.println("Assando " + this.sabor);
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparando " + this.sabor);
    }
    
    @Override
    public void cut() {
        System.out.println("Cortando " + this.sabor);
    }
    
    @Override
    public void box() {
        System.out.println("Embalando " + this.sabor);
    }
}
