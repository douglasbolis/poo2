package state.semaforo;

import state.semaforo.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class VermelhoSetupState extends AbstractSemaforoSetup {
    public VermelhoSetupState( SemaforoSetup semaforoSetup, Integer time ) {
        this.semaforoSetup = semaforoSetup;
        //this.time = 30000;
        this.time = time;
    }

    @Override
    public void selectNextState() {
        Saida.println( "Vermelho" );
        semaforoSetup.setState( semaforoSetup.getVerdeSetupState() );
    }
}
