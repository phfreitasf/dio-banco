import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

import java.util.Scanner;

public class Main {

    static void selecionarConta() {
        System.out.println("Selecione a conta:");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupanca");
    }

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro");
        Conta conta1 = new ContaCorrente(pedro);
        Conta conta2 = new ContaPoupanca(pedro);
        Scanner scan = new Scanner(System.in);
        boolean ativo = true;



        while (ativo) {
            System.out.println("Digite a operação:");
            System.out.println("1 - Consulta extrato");
            System.out.println("2 - Saque");
            System.out.println("3 - Deposito");
            System.out.println("4 - Transferência");
            System.out.println("5 - Encerrar");

            double valor;
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    conta1.imprimeExtrato();
                    conta2.imprimeExtrato();
                    break;
                case 2:
                    selecionarConta();
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor para saque:");
                            valor = scan.nextDouble();
                            conta1.sacar(valor);
                            break;
                        case 2:
                            System.out.println("Digite o valor para saque:");
                            valor = scan.nextDouble();
                            conta2.sacar(valor);
                            break;
                        default:
                            System.out.println("Opcao inválida");
                            break;
                    }
                    break;
                case 3:
                    selecionarConta();
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor para deposito:");
                            valor = scan.nextDouble();
                            conta1.depositar(valor);
                            break;
                        case 2:
                            System.out.println("Digite o valor para saque:");
                            valor = scan.nextDouble();
                            conta2.depositar(valor);
                            break;
                        default:
                            System.out.println("Opcao inválida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("pepepe");
                    break;
                case 5:
                    System.out.println("Encerrando aplicação!");
                    ativo = false;
                    break;
            }
        }
    }
}