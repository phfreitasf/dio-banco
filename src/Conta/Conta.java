package Conta;

import Cliente.Cliente;
import Conta.Interface.IConta;

public abstract class Conta implements IConta {
    private static Integer SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo = 0;



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo > 0 && this.saldo - valor < 0)
        {
            this.saldo -= valor;
            System.out.println(String.format("O valor %d foi retirado da conta", valor ));
        }
        else System.out.println(String.format("Saldo insuficiente, o saldo atual é R$" + this.saldo));
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    public void imprimeInfos() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
