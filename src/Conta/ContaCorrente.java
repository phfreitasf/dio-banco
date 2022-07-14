package Conta;

import Cliente.Cliente;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimeExtrato() {
        System.out.println("== CONTA CORRENTE ==");
        super.imprimeInfos();

    }
}
