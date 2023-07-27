package mergulhojava.banco.modelo.pagamento;

import mergulhojava.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel{
    private Pessoa fucionario;
    private final double valorHora;
    private final int quantidadeDeHoras;
    private boolean pago;

    public Holerite(Pessoa fucionario, double valorHora, int quantidadeDeHoras) {
        this.fucionario = fucionario;
        this.valorHora = valorHora;
        this.quantidadeDeHoras = quantidadeDeHoras;

    }

    public double getValorHora() {
        return valorHora;
    }

    public int getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora*quantidadeDeHoras;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;

    }
}
