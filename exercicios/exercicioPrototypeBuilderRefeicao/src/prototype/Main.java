package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author douglas
 */
public class Main {
    static HashMap<String, Refeicao>  refeicoes = new HashMap<>();

    public static void main(String[] args) {
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();

        System.out.println("\nRefeição não vegetariana: ");
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", false);
        refeicoes.put("laranja/suco" , refeicao1 );

        System.out.println("\nRefeição vegetariana: ");
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("uva", "refrigerante", true);
        refeicoes.put("guarana/refrigerante" , refeicao2 );

        Refeicao  refeicaoClone1 = (Refeicao) refeicoes.get("laranja/suco").clone();
        Refeicao  refeicaoClone2 = (Refeicao) refeicoes.get("guarana/refrigerante").clone();
        refeicao1.getBebida().setSabor("morango");

        System.out.println("\nClone refeicao 1 " + refeicaoClone1.getBebida().getSabor());
        System.out.println("Refeicao1 " + refeicao1.getBebida().getSabor());

        Refeicao novaRefeicao = (Refeicao) deepClone(refeicao1);
        novaRefeicao.getBebida().setSabor("abacaxi");

        System.out.println("\nNova Refeicao1: " + novaRefeicao.getBebida().getSabor());
        System.out.println("Refeicao1 " + refeicao1.getBebida().getSabor());
    }

    /*
     * This method makes a "deep clone" of any Java object it is given.
     */
    public static Object deepClone(Object object) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
