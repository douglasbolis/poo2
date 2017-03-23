package builder.piscina;

/**
 *
 * @author douglas
 */
public class RectangularPool extends Pool {
    private Ladder ladder;

    public Ladder getLadder() {
        return this.ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }
}
