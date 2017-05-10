package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash10Handler extends AbstractAtmHandler {
    public Cash10Handler() {
        this.valueCedula = 10;
    }

    public void handleHere( Integer qtdCedulas ) {
        Saida.println( " - " + qtdCedulas + " nota(s) de R$ 10,00." );
    }
}
