package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash5Handler extends AbstractAtmHandler {
    public Cash5Handler() {
        this.valueCedula = 5;
    }

    public void handleHere( Integer qtdCedulas ) {
        Saida.println( " - " + qtdCedulas + " nota(s) de R$ 5,00." );
    }
}
