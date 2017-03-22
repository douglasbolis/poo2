package singleton.telefone;

/**
 *
 * @author douglas
 */
public enum NumberGenerator {
    NUMERO;

    private int count;

    public synchronized int geraNumero() {
        return ++count;
    }
}
