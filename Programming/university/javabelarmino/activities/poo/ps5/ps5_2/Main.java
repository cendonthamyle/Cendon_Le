package programming.university.javabelarmino.activities.poo.ps5.ps5_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(
            new ContaCorrente(1, "Ana", 500.00)
        );

        contas.add(
            new ContaPoupanca(2, "Bruno", 300.00)
        );

        contas.add(
            new ContaSalario(3, "Carla", 1000.00)
        );

        for (ContaBancaria conta : contas) {
            System.out.println("\n----------------------------");
            conta.exibirDados();

            conta.depositar(100.00);
            conta.sacar(50.00);

            System.out.printf(
                "Saldo após as operações: R$ %.2f%n",
                conta.getSaldo()
            );
        }

        System.out.println("\n--- Segundo saque na conta-salário ---");

        ContaBancaria contaSalario = contas.get(2);
        contaSalario.sacar(100.00);

        System.out.printf(
            "Saldo final da conta-salário: R$ %.2f%n",
            contaSalario.getSaldo()
        );
    }
}