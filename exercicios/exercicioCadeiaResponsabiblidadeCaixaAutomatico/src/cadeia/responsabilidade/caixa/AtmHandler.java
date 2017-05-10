package cadeia.responsabilidade.caixa;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public interface AtmHandler {
    public void processHandler( Integer cash );
    public void setNextHandler( AtmHandler nextHandler );
}
