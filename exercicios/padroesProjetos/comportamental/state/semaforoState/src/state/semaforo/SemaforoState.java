/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.semaforo;

/**
 *
 * @author dougglas
 */
public interface SemaforoState {

    public long getTime();
    public void printState();
    public SemaforoState getNextState();
    public void setNextState( SemaforoState semaforoState );

}
