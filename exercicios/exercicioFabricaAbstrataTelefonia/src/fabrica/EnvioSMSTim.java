package fabrica;

import fabrica.Mensagem;

/**
 *
 * @author douglas
 */
public class EnvioSMSTim implements IEnvioSMS {
    public EnvioSMSTim(String config) {
        //realiza configuracao especifica para tim.
    }

    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone tim:" + telefone );
        return true;
    }
}
