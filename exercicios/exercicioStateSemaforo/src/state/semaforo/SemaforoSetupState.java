package state.semaforo;

/**
 *
 * @author douglas
 */
public interface SemaforoSetupState {
    public void selectNextState();
    public Integer getTime();
}
