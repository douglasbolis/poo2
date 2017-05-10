package cadeia.responsabilidade.caixa;

/**
 *
 * @author douglas
 */
public abstract class AbstractAtmHandler implements AtmHandler {
    protected Integer valueCedula;
    private AtmHandler nextHandler;
    
    public void processHandler( Integer cash ) {
        Integer qtdCedula = cash / valueCedula;
        Integer restante = cash % valueCedula;

        if ( ( restante % 2 != 0 ) && ( restante < 4 ) ) {
            qtdCedula--;
            restante += valueCedula;
        }
        if ( qtdCedula > 0 ) {
            handleHere( qtdCedula );
        }
        if ( nextHandler != null ) {
            nextHandler.processHandler( restante );
        }
    }

    public void setNextHandler( AtmHandler nextHandler ) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleHere( Integer qtdCedulas );
}
