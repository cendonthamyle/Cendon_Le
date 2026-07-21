package programming.university.javabelarmino.activities.poo.ps5.ps5_2;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int id, String titular, double saldoInicial) {
        super(id, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return;
        }

        if (valor > saldo) {
            System.out.println(
                "Saque não permitido: a conta-poupança não pode ficar negativa."
            );
            return;
        }

        saldo -= valor;

        System.out.printf(
            "Saque de R$ %.2f realizado na conta-poupança.%n",
            valor
        );
    }
}