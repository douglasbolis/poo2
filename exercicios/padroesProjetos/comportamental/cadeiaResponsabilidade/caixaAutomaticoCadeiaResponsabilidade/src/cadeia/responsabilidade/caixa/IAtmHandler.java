package cadeia.responsabilidade.caixa;

/**
 *
 * @author douglas
 */
public interface IAtmHandler {
  public void processHandler( Integer cash );
  public void setNextHandler( IAtmHandler nextHandler );
}
