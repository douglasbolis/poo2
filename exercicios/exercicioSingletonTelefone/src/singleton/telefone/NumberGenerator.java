package singleton.telefone;

/**
 *
 * @author douglas
 */
public enum NumberGenerator {
    NUMERO;

    private int count = 998000000;

    public synchronized int geraNumero() {
        return ++count;
    }
}
