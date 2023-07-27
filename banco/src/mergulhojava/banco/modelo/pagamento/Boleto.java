package mergulhojava.banco.modelo.pagamento;

import mergulhojava.banco.modelo.Pessoa;



public class Boleto implements DocumentoPagavel{

    private Pessoa benificiario;
    private double valor;
    private boolean pago;

    public Boleto(Pessoa benificiario, double valor) {
        this.benificiario = benificiario;
        this.valor = valor;

    }

    @Override
    public double getValorTotal() {
        return valor;
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
