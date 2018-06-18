/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.semaforo;

import state.TelaSemaforo;

/**
 *
 * @author dougglas
 */
public class VermelhoSetupState extends AbstractSemaforoSetup {

    public VermelhoSetupState( SemaforoSetup semaforoSetup, TelaSemaforo tela ) {
        super( semaforoSetup, semaforoSetup.timeVermelho, tela );
    }

    @Override
    public void printState () {
        this.tela.enableVermelho();
    }

    @Override
    public SemaforoState getNextState() {
        return this.nextSemaforo;
    }

    @Override
    public void setNextState( SemaforoState semaforoState ) {
        this.nextSemaforo = semaforoState;
    }

}
