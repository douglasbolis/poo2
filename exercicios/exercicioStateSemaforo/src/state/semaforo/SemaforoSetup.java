package state.semaforo;

/**
 *
 * @author douglas
 */
public class SemaforoSetup {
    SemaforoSetupState currentState;
    SemaforoSetupState verdeState;
    SemaforoSetupState amareloState;
    SemaforoSetupState vermelhoState;

    public SemaforoSetup() {
        verdeState = new VerdeSetupState( this, 30000 );
        amareloState = new AmareloSetupState( this, 3000 );
        vermelhoState = new VermelhoSetupState( this, 60000 );
        
        // Estado inicial
        setState( verdeState );
    }

    public SemaforoSetupState getCurrentState() {
        return currentState;
    }

    public void setState( SemaforoSetupState state ) {
        currentState = state;
    }

    public SemaforoSetupState getVerdeSetupState() {
        return verdeState;
    }

    public SemaforoSetupState getAmareloSetupState() {
        return amareloState;
    }

    public SemaforoSetupState getVermelhoSetupState() {
        return vermelhoState;
    }
}
