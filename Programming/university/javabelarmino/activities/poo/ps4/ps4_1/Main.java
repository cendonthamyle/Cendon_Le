package programming.university.javabelarmino.activities.poo.ps4.ps4_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário bruto (R$): ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Empregado emp = new Empregado(nome, salarioBruto, imposto);

        System.out.println();
        System.out.print("Empregado: ");
        emp.exibirInfo();

        System.out.println();
        System.out.print("Qual o percentual para aumentar o salário? ");
        double percentual = sc.nextDouble();
        emp.aumentaSalario(percentual);

        System.out.println();
        System.out.print("Dados atualizados: ");
        emp.exibirInfo();

        sc.close();
    }
}