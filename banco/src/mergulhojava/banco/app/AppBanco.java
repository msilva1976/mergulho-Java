package mergulhojava.banco.app;

import mergulhojava.banco.modelo.ContaEspecial;
import mergulhojava.banco.modelo.ContaInvestimento;
import mergulhojava.banco.modelo.Pessoa;

public class AppBanco {
    public static void main(String[] args) {
        //Pessoa titular1 = new Pessoa("Marcos Carlos da Silva","25437874880");
        Pessoa titular2 = new Pessoa("Monica Quieroz Machado","26321542550");
       // ContaInvestimento conta001 = new ContaInvestimento(titular1,1,4113,0);
        ContaEspecial conta002 = new ContaEspecial(titular2,1,4114,1000);

      // conta001.depositar(15000);
      // conta001.sacar(1000);
      // conta001.creditaRendimento(0.8);
       conta002.depositar(15000);
       conta002.sacar(16010);
       //conta001.imprimir();
       conta002.imprimir();



    }
}
