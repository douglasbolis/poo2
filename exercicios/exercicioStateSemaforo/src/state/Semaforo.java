package state;

import java.util.Timer;
import java.util.TimerTask;
import state.semaforo.SemaforoSetup;
import state.semaforo.SemaforoSetupState;

/**
 *
 * @author douglas
 */
public class Semaforo {
    Timer timer;
    public Semaforo( Integer seconds ) {
        this.timer = new Timer();
        this.timer.schedule( new SemaforoTask(), seconds);
    }

    class SemaforoTask extends TimerTask {
        @Override
        public void run() {
            timer.cancel();
        }
    }

    public static void main( String[] args ) {
        SemaforoSetup semaforo = new SemaforoSetup();
        SemaforoSetupState semaforoState;
        Semaforo semaforoTimer;

        while( true ) {
            semaforoState = semaforo.getCurrentState();
            semaforoTimer = new Semaforo( semaforoState.getTime() );
            semaforoState.selectNextState();
        }
    }
}
