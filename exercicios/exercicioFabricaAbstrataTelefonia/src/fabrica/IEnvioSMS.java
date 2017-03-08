package fabrica;

import fabrica.Mensagem;

/**
 *
 * @author douglas
 */
public interface IEnvioSMS {
    public boolean enviar(Mensagem msg, int telefone);
}
