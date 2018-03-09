package fabrica;

public class PizzaFactory {
  public Pizza createPizza ( String typePizza ) {
    Pizza pizza = null;

    if ( typePizza.equalsIgnoreCase( "cheese" ) ) {
      pizza = new CheesePizza();
    } else
    if ( typePizza.equalsIgnoreCase( "clam" ) ) {
      pizza = new ClamPizza();
    } else
    if ( typePizza.equalsIgnoreCase( "pepperoni" ) ) {
      pizza = new PepperoniPizza();
    } else
    if ( typePizza.equalsIgnoreCase( "veggie" ) ) {
      pizza = new VeggiePizza();
    }

    return pizza;
  }
}
