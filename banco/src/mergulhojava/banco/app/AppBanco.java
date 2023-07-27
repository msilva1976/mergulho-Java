package mergulhojava.banco.app;

import mergulhojava.banco.modelo.atm.CaixaEletronico;

import mergulhojava.banco.modelo.ContaInvestimento;
import mergulhojava.banco.modelo.Pessoa;
import mergulhojava.banco.modelo.pagamento.Boleto;

import mergulhojava.banco.modelo.pagamento.Holerite;

public class AppBanco {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        Pessoa titular1 = new Pessoa("Marcos Carlos da Silva","25437874880");
        ContaInvestimento conta001 = new ContaInvestimento(titular1,1,4113,0);
        conta001.depositar(15000);
        conta001.sacar(1000);
        conta001.debitarTarifaMensal();
        conta001.creditaRendimento(0.8);
        Boleto boletoEscola = new Boleto(titular1,200);
        Holerite salario = new Holerite(titular1,100,160);
        caixaEletronico.pagar(salario,conta001);
        caixaEletronico.pagar(boletoEscola,conta001);
        System.out.println("Boleto pago: "+boletoEscola.estaPago());

        caixaEletronico.imprimirSaldo(conta001);
        caixaEletronico.folhaDePagamento(salario);
        caixaEletronico.imprimirSalario(salario);

       

       
   



    }
}
