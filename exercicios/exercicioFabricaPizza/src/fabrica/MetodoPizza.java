package fabrica;

/**
 *
 * @author douglas
 */
public class MetodoPizza {
    public static void main(String[] args) {
        PizzaStore pf = new PizzaStore();
        Pizza pizza;

        pizza = pf.orderPizza("queijo");
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();

        pizza = pf.orderPizza("frutos do mar");
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();

        pizza = pf.orderPizza("pepperoni");
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();

        pizza = pf.orderPizza("vegetariano");
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }
}
