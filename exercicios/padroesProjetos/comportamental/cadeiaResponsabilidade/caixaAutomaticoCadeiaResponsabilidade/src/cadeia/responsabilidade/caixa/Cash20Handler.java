package cadeia.responsabilidade.caixa;

import cadeia.responsabilidade.fronteira.Saida;

/**
 *
 * @author douglas
 */
public class Cash20Handler extends AbstractAtmHandler {
  public Cash20Handler() {
    this.valueCedula = 20;
  }

  @Override
  public void handleHere( Integer qtdCedulas ) {
    Saida.println( " - " + qtdCedulas + " nota(s) de R$ 20,00." );
  }
}
