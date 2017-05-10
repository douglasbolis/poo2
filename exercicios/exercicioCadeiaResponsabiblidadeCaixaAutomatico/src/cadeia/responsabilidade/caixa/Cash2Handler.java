package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash2Handler extends AbstractAtmHandler {
    public Cash2Handler( Integer valueCedula ) {
        this.valueCedula = valueCedula;
    }

    public void handleHere( Integer qtdCedulas ) {
        Saida.println( qtdCedulas + " nota(s) de R$ 2,00." );
    }
}
