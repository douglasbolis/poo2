package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash20Handler extends AbstractAtmHandler {
    public Cash20Handler( Integer valueCedula ) {
        this.valueCedula = valueCedula;
    }

    public void handleHere( Integer qtdCedulas ) {
        Saida.println( qtdCedulas + " nota(s) de R$ 20,00." );
    }
}