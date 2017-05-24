package state.semaforo;

import state.semaforo.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class VerdeSetupState extends AbstractSemaforoSetup {
    public VerdeSetupState( SemaforoSetup semaforoSetup, Integer time ) {
        this.semaforoSetup = semaforoSetup;
        //this.time = 60000;
        this.time = time;
    }

    @Override
    public void selectNextState() {
        Saida.println( "Verde" );
        semaforoSetup.setState( semaforoSetup.getAmareloSetupState() );
    }
}
