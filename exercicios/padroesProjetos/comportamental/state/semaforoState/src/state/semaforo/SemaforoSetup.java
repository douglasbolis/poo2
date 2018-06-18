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
public class SemaforoSetup {

    final int timeVerde = 3000;
    final int timeAmarelo = 3000;
    final int timeVermelho = 3000;
    SemaforoState currentState;
    SemaforoState verdeState;
    SemaforoState amareloState;
    SemaforoState vermelhoState;

    public SemaforoSetup ( TelaSemaforo tela ) {
        this.verdeState = new VerdeSetupState( this, tela );
        this.amareloState = new AmareloSetupState( this, tela );
        this.vermelhoState = new VermelhoSetupState( this, tela );
        
        // Definindo looping de estados
        this.verdeState.setNextState( amareloState );
        this.amareloState.setNextState( vermelhoState );
        this.vermelhoState.setNextState( verdeState );
        
        // Estado inicial
        this.currentState = verdeState;
    }
    
    public void setState ( SemaforoState state ) {
        this.currentState = state;
    }

    public SemaforoState getCurrentState () {
        this.currentState.printState();
        return this.currentState;
    }

    public void pushNextState () {
        this.currentState = this.currentState.getNextState();
    }
}

