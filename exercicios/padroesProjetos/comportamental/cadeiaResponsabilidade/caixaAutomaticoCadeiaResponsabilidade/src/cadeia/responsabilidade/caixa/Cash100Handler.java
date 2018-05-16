package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash100Handler extends AbstractAtmHandler {
  public Cash100Handler() {
    this.valueCedula = 100;
  }

  @Override
  public void handleHere( Integer qtdCedulas ) {
    Saida.println( " - " + qtdCedulas + " nota(s) de R$ 100,00." );
  }
}
