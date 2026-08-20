package WILLIAN;

public class index {
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.print("CPF: ");
        conta.cpf = scanner.nextLine();

        System.out.print("Nome do banco: ");
        conta.nomeBanco = scanner.nextLine();

        System.out.print("Agência: ");
        conta.agencia = scanner.nextInt();

        System.out.print("Número da conta: ");
        conta.numeroConta = scanner.nextInt();

        System.out.println("\nSaldo inicial: R$ " + conta.saldo);

        System.out.print("Digite o valor para saque: ");
        double valor = scanner.nextDouble();

        conta.sacar(valor);

        System.out.println("Saldo atual: R$ " + conta.saldo);

        scanner.close();
    }
}
}
