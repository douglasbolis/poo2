package entidades;

class ContaPoupanca extends Conta {
  public double saldo;
  public double juros;
  public ContaPoupanca ( double saldo, double juros ) {
    super( saldo );
    this.juros = juros;
  }
}