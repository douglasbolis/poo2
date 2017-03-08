package fabrica;

import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog("Tim ou Vivo?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");

        Mensagem msg = new Mensagem(texto);
        FabricaAbstrataEnvios fabrica = null;

        if (escolha.equalsIgnoreCase("tim")) {
            fabrica = new FabricaTim();
        } else if(escolha.equalsIgnoreCase("vivo")) {
            fabrica = new FabricaVivo();
        } else if(escolha.equalsIgnoreCase("claro")) {
            fabrica = new FabricaClaro();
        }

        IEnvioSMS envio = fabrica.criaEnvioSMS();
        if (envio.enviar(msg, telefone)) {
            ICobranca cobranca = fabrica.criaCobranca();
            cobranca.cobrar(telefone);
        }
    }
}
