package mergulhojava.banco.modelo;

public class ContaEspecial extends Conta {
    private double valorLiminte;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLiminte) {
        super(titular, agencia, numero);
        this.valorLiminte = valorLiminte;
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo()+getValorLiminte();

    }

    public double getValorLiminte() {
        return valorLiminte;
    }

    public void setValorLiminte() {
        this.valorLiminte = valorLiminte;
    }
}
