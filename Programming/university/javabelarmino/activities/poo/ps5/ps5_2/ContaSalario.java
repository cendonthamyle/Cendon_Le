package programming.university.javabelarmino.activities.poo.ps5.ps5_2;

import java.time.LocalDate;

public class ContaSalario extends ContaBancaria {
    private int mesUltimoSaque;
    private int anoUltimoSaque;

    public ContaSalario(int id, String titular, double saldoInicial) {
        super(id, titular, saldoInicial);

        mesUltimoSaque = -1;
        anoUltimoSaque = -1;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
            return;
        }

        LocalDate dataAtual = LocalDate.now();

        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        if (mesAtual == mesUltimoSaque && anoAtual == anoUltimoSaque) {
            System.out.println(
                "Saque não permitido: já foi realizado um saque neste mês."
            );
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        mesUltimoSaque = mesAtual;
        anoUltimoSaque = anoAtual;

        System.out.printf(
            "Saque de R$ %.2f realizado na conta-salário.%n",
            valor
        );
    }
}