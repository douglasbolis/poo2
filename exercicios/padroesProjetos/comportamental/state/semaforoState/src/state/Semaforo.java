/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import state.semaforo.SemaforoSetup;
import state.semaforo.SemaforoState;

/**
 *
 * @author dougglas
 */
public class Semaforo {

    public static void main ( String[] args ) throws InterruptedException {
        TelaSemaforo telaSemaforo = new TelaSemaforo();
        telaSemaforo.setVisible( true );
        SemaforoState semaforoState = null;
        SemaforoSetup semaforo = new SemaforoSetup( telaSemaforo );

        while( true ) {
            semaforoState = semaforo.getCurrentState();
            Thread.sleep( semaforoState.getTime() );
            semaforo.pushNextState();
        }
    }

}
