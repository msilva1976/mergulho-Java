package mergulhojava.banco.modelo;

public class ContaEspecial extends Conta {
    private final double valorLiminte;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLiminte) {
        super(titular, agencia, numero);
        this.valorLiminte = valorLiminte;
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo()+getValorLiminte();

    }

    @Override
    public void debitarTarifaMensal() {
        sacar(10);

    }

    public double getValorLiminte() {
        return valorLiminte;
    }


}
