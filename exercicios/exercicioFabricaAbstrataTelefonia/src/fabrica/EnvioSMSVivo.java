package fabrica;

import fabrica.Mensagem;

/**
 *
 * @author douglas
 */
public class EnvioSMSVivo implements IEnvioSMS {
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone vivo:" + telefone );
        return true;
    }
}
