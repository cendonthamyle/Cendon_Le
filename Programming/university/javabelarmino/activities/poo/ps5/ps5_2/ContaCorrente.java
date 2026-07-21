package programming.university.javabelarmino.activities.poo.ps5.ps5_2;

public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 2.00;

    public ContaCorrente(int id, String titular, double saldoInicial) {
        super(id, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return;
        }

        double valorTotal = valor + TAXA_SAQUE;

        if (valorTotal > saldo) {
            System.out.println(
                "Saldo insuficiente para o saque e a cobrança da taxa."
            );
            return;
        }

        saldo -= valorTotal;

        System.out.printf(
            "Saque de R$ %.2f realizado. Taxa cobrada: R$ %.2f.%n",
            valor,
            TAXA_SAQUE
        );
    }
}