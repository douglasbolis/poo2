package composite;

/**
 *
 * @author douglas
 */
public abstract class Menu {
    private String name;

    public void setName( String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
