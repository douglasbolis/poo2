package fabrica;

/**
 *
 * @author douglas
 */
public class PizzaStore {
    public Pizza orderPizza(String pizza) {
        String nomeClasse = "fabrica.";
        if (pizza.equalsIgnoreCase("queijo")) {
            nomeClasse += "CheesePizza";
        } else  if (pizza.equalsIgnoreCase("frutos do mar")) {
            nomeClasse += "ClamPizza";
        } else if (pizza.equalsIgnoreCase("vegetariano")) {
            nomeClasse += "VeggiePizza";
        } else {
            nomeClasse += "PepperoniPizza";
        }
        
        return PizzaFactory.createPizza(nomeClasse);
    }
}
