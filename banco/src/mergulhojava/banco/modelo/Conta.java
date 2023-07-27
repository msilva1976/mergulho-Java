package mergulhojava.banco.modelo;

import java.text.NumberFormat;

import java.util.Locale;



public abstract class Conta {
    private final Pessoa titular;

    private int agencia;
    private int numero;
    private double saldo;


    NumberFormat num = NumberFormat.getInstance();
    NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());




    public Conta(Pessoa titular, int agencia, int numero) {

        this.titular = titular;
        this.setAgencia(agencia);
        this.setNumero(numero);
       
    }



    public void depositar(double valor){

            if (valor <=0 ){
                saldo= getSaldo();
                System.out.println("Conta: "+num.format(getNumero())+" Valor invalido, seu saldo permanece o mesmo! "+moeda.format(saldo));

            }else {
                saldo = saldo + valor;
            }

    }
    public void sacar(double valor)
    {if (saldo < valor ) {
            System.out.println("Saldo insuficiente");
    }else {
        saldo = saldo - valor;
    }
    if (getSaldoDisponivel()-valor < 0 ){
        System.out.println("saldo insuficiente");
        getSaldoDisponivel();


    }else {
        saldo = saldo-valor;
    }

    }
    public double getSaldoDisponivel(){
        return getSaldo();

    }
    public  abstract void  debitarTarifaMensal();
    public Pessoa getTitular() {
        return titular;
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


}
