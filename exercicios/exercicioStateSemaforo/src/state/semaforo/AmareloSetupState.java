package state.semaforo;

import state.semaforo.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class AmareloSetupState extends AbstractSemaforoSetup {
    public AmareloSetupState( SemaforoSetup semaforoSetup, Integer time ) {
        this.semaforoSetup = semaforoSetup;
        //this.time = 1000;
        this.time = time;
    }

    @Override
    public void selectNextState() {
        Saida.println( "Amarelo" );
        semaforoSetup.setState( semaforoSetup.getVermelhoSetupState() );
    }
}
