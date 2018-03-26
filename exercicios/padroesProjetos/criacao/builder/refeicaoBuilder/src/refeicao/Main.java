package refeicao;

/**
 *
 * @author douglas
 */
public class Main {
  public static void main ( String[] args ) {
    DiretorRefeicao criaRefeicao = new DiretorRefeicao();

    System.out.println( "\nRefeição 1:" );
    Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana( "laranja", "suco", true );

    System.out.println( "\nRefeição 2:" );
    Refeicao refeicao2 = criaRefeicao.preparaVegetariana( "guarana", "refrigerante", true );

    System.out.println( "\nRefeição 3:" );
    Refeicao refeicao3 = criaRefeicao.preparaVegetariana( "morango", "suco", false );
  }
}
