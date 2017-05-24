package state.semaforo;

/**
 *
 * @author douglas
 */
public abstract class AbstractSemaforoSetup implements SemaforoSetupState {
    protected SemaforoSetup semaforoSetup;
    protected Integer time;

    @Override
    public Integer getTime() {
        return time;
    }
}
