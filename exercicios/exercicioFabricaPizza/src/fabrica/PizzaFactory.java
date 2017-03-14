package fabrica;

/**
 *
 * @author douglas
 */
public class PizzaFactory {
    public static Pizza createPizza(String classe) {
        Pizza pizza;
        Object classeReflection = null;
        
	try {
            classeReflection = Class.forName(classe).newInstance();            
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        pizza = (Pizza) classeReflection;
        return pizza;
    }
}
