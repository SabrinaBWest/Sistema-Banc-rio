package banco;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Banco banco = new Banco();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Bem-vindo ao Banco Digital!");
            System.out.println("1. Criar conta física");
            System.out.println("2. Criar conta jurídica");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Verificar saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar buffer

            switch (opcao) {
                case 1:
                    criarContaFisica();
                    break;
                case 2:
                    criarContaJuridica();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    verificarSaldo();
                    break;
                case 6:
                    running = confirmarSaida();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println("Obrigado por usar o Banco Digital!");
    }

    private static void criarContaFisica() {
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        banco.criarContaFisica(numero, cpf, nome);
    }

    private static void criarContaJuridica() {
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Digite a Razão Social: ");
        String razaoSocial = scanner.nextLine();
        banco.criarContaJuridica(numero, cnpj, razaoSocial);
    }

    private static void depositar() {
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.print("Digite o valor do depósito: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();  // Limpar buffer
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void sacar() {
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();  // Limpar buffer
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void verificarSaldo() {
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();
        Conta conta = banco.buscarConta(numero);
        if (conta != null) {
            conta.exibirInformacoes();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static boolean confirmarSaida() {
        System.out.print("Tem certeza de que deseja sair? (s/n): ");
        String resposta = scanner.nextLine().toLowerCase();
        return !resposta.equals("s");
    }
}

