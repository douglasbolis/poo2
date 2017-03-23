package builder.piscina;

/**
 *
 * @author douglas
 */
public abstract class Pool {
    private String color;
    private boolean antiLeak;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getAntiLeak() {
        return antiLeak;
    }

    public void setAntiLeak(boolean antiLeak) {
        this.antiLeak = antiLeak;
    }
}
