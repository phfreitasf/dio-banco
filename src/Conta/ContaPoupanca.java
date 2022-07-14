package Conta;

import Cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimeExtrato() {
        System.out.println("== CONTA POUPANCA ==");
        super.imprimeInfos();
    }
}
