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
public abstract class AbstractSemaforoSetup implements SemaforoState {

    protected SemaforoSetup semaforoSetup;
    protected SemaforoState nextSemaforo;
    protected TelaSemaforo tela;
    protected long time;
    
    public AbstractSemaforoSetup ( SemaforoSetup semaforoSetup, long time, TelaSemaforo tela ) {
        this.semaforoSetup = semaforoSetup;
        this.time = time;
        this.tela = tela;
    }

    @Override
    public long getTime() {
        return time;
    }

}
