package singleton.telefone;

/**
 *
 * @author douglas
 */
public class TelefoneSingleTon implements Runnable {
    public void run() {
        System.out.println("Número gerado: " + NumberGenerator.NUMERO.geraNumero());
    }
}   
      