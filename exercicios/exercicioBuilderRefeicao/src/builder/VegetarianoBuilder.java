package builder;

/**
 *
 * @author douglas
 */
public class VegetarianoBuilder extends RefeicaoBuilder {
    public VegetarianoBuilder(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public void preparaHamburgerVegetariano() {
        System.out.println("Cria hamburger vegetariano");
        this.refeicao.setHamburger(new HamburgerVegetariano());
    }
}
