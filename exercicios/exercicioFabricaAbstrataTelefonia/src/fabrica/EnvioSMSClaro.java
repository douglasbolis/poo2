package fabrica;

import fabrica.Mensagem;

/**
 *
 * @author douglas
 */
public class EnvioSMSClaro implements IEnvioSMS {
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem: " +  msg.texto + 
                " para o telefone claro:" + telefone );
        return true;
    }
}
