public class ContaBancaria {

    String nomeCliente;
    String cpf;
    String nomeBanco;
    int agencia;
    int numeroConta;
    double saldo = 500.00;

    public double sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        return saldo;
    }
}