package festa.dominio;

/**
 *
 * @author douglas
 */
public abstract class Festa {
    String description = "Festa Desconhecida";
    
    public String getDescription() {
        return description;
    }
     
    public Festa() { }

    public abstract double cost();
}
