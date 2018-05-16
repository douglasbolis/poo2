package cadeia.responsabilidade.caixa;

/**
 *
 * @author douglas
 */
public abstract class AbstractAtmHandler implements IAtmHandler {
  protected Integer valueCedula;
  private IAtmHandler nextHandler;
  
  @Override
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

  @Override
  public void setNextHandler( IAtmHandler nextHandler ) {
    this.nextHandler = nextHandler;
  }

  protected abstract void handleHere( Integer qtdCedulas );
}
