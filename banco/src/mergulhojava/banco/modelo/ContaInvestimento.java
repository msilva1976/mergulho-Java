package mergulhojava.banco.modelo;

public class ContaInvestimento extends Conta{


    public ContaInvestimento(Pessoa titular, int agencia, int numero, int i) {
        super(titular, agencia, numero);
    }
    public void creditaRendimento(double percentualJuros){
        double valorRendimento = getSaldo()*percentualJuros/100;
        depositar(valorRendimento);

    }

}
