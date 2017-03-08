package entidades;

import interfaces.*;

public class ContaCorrente extends Conta implements Tributavel {
    public double calculaTributos() {
        return getSaldo() + 0.1;
    }
}
