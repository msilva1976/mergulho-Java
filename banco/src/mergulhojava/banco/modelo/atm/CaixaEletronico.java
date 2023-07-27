package mergulhojava.banco.modelo.atm;


import mergulhojava.banco.modelo.Conta;
import mergulhojava.banco.modelo.pagamento.DocumentoPagavel;
import mergulhojava.banco.modelo.pagamento.Holerite;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CaixaEletronico {

    NumberFormat num = NumberFormat.getInstance();
    NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
    Currency corrency = moeda.getCurrency();
    public void imprimirSaldo(Conta conta){
        System.out.println("Tutular: "+conta.getTitular().getNome());
        System.out.println("Documento: "+conta.getTitular().getDocumento());
        System.out.println("Agencia: "+num.format(conta.getAgencia()));
        System.out.println("Conta: "+num.format(conta.getNumero()));
        System.out.println("Saldo: "+moeda.format(conta.getSaldo()));
        System.out.println("Saldo e limite disponivel: "+moeda.format(conta.getSaldoDisponivel()));
        System.out.println(corrency);
        System.out.println("-----------------------------------------");

    }
    public void imprimirSalario(Holerite salario){
        System.out.println("Salario mensal: "+ moeda.format(salario.getValorTotal()));


    }
    public void  folhaDePagamento(Holerite folha){
        System.out.println("Horas trabalhadas: "+num.format(folha.getQuantidadeDeHoras()));
        System.out.println("Valor pago por hora trabalhada: "+moeda.format(folha.getValorHora()));

    }
    public  void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalArgumentException("Documento ja e");

        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }


}
