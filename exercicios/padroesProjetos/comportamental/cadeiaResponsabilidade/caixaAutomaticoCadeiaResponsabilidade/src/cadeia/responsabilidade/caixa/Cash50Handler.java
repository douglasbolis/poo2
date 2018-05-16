package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash50Handler extends AbstractAtmHandler {
  public Cash50Handler() {
    this.valueCedula = 50;
  }

  @Override
  public void handleHere( Integer qtdCedulas ) {
    Saida.println( " - " + qtdCedulas + " nota(s) de R$ 50,00." );
  }
}
