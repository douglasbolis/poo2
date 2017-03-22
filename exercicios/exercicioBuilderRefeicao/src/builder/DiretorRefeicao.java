package builder;

/**
 *
 * @author douglas
 */
public class DiretorRefeicao {
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida, Boolean batata) {
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);

        if (tipoBebida.equalsIgnoreCase("refrigerante")) {
            refeicaoBuilder.adicionarRefrigerante(sabor);
        } else {
            refeicaoBuilder.adicionarSuco(sabor);
        }
        if (batata) {
            refeicaoBuilder.preparaBatata();
        }

        refeicaoBuilder.prepadaHamburgerCarne();
        return novaRefeicao;
    }

    public Refeicao preparaVegetariana(String sabor, String tipoBebida, Boolean batata) {
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);

        if (tipoBebida.equalsIgnoreCase("refrigerante")) {
            refeicaoBuilder.adicionarRefrigerante(sabor);
        } else {
            refeicaoBuilder.adicionarSuco(sabor);
        }
        if (batata) {
            refeicaoBuilder.preparaBatata();
        }

        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;
    }    
}
