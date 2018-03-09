package fabrica;

public class PizzaStore {
  public Pizza orderPizza () {
    PizzaFactory pizzaFactory = new PizzaFactory();
    return pizzaFactory.createPizza( "clam" );
  }
}
