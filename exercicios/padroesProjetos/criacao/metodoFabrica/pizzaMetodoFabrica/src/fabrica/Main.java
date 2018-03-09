package fabrica;

public class Main {
  public static void main ( String[] args ) {
    PizzaStore pizzaStore = new PizzaStore();
    Pizza pizza = pizzaStore.orderPizza();

    pizza.bake();
    pizza.prepare();
    pizza.cut();
    pizza.box();
  }
}
