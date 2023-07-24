import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Conta {
    private String nomeTitular;
    private String documento;
    private int agencia;
    private int numero;
    private double saldo;

    Locale br = new Locale("pt","Brasil");
    NumberFormat num = NumberFormat.getInstance(br);
    NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
    Currency corrency = moeda.getCurrency();


    public Conta(String nomeTitular,String documento,int agencia, int numero, double saldo) {
        this.nomeTitular = nomeTitular;
        this.documento = documento;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.saldo = saldo;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
        public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void imprimir(){
        System.out.println("Titular: "+getNomeTitular());
        System.out.println("Documento: "+(getDocumento()));
        System.out.println("Agencia: "+num.format(getAgencia()));
        System.out.println("Conta: "+num.format(getNumero()));
        System.out.println("Saldo: "+moeda.format(getSaldo()));
        System.out.println(corrency);

    }
    void depositar(double valor){

            if (valor <=0 ){
                saldo= getSaldo();
                System.out.println("Valor depoisitado é menor que zero, seu saldo permanece o mesmo! "+moeda.format(saldo));

            }else {
                saldo = saldo + valor;
            }

    }


}
