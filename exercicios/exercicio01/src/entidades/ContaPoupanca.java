package entidades;

public class ContaPoupanca extends Conta {
    private double juros;

    public ContaPoupanca(double saldo) {
        setSaldo(saldo);
    }

    public double getJuros() {
        return this.juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    public void debitarSaldo(double valor) {
        double saldoAtual = getSaldo();
        if (saldoAtual >= valor) {
            setSaldo(saldoAtual - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void creditarSaldo(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
