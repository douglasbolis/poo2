package entidades;

import interfaces.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {
  public double saldo;
  public ContaCorrente ( double saldo ) {
    super( saldo );
  }

  public double calculaTributos() {
    return this.saldo * 0.1;
  }
}