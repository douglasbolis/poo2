package builder;

/**
 *
 * @author douglas
 */
public class Main {    
    public static void main(String[] args) {
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();
        System.out.println("\nRefeição não vegetariana 1:");
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", false);
        System.out.println("\nRefeição vegetariana 1:");
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("uva", "refrigerante", true);
        System.out.println("\nRefeição vegetariana 2:");
        Refeicao refeicao3 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", false);
    }
}
