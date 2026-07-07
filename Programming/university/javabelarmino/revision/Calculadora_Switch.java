package programming.university.javabelarmino.revision;

import java.util.Scanner;

public class Calculadora_Switch {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println(" Divisão por zero não é permitida!");
            return Double.NaN; 
        }
        return a / b;
    }

    public char sinalMatematico(int operacao) {
        switch (operacao) {
            case 1: return '+';
            case 2: return '-';
            case 3: return '*';
            case 4: return '/';
            default: return '?';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora_Switch calc = new Calculadora_Switch();

        System.out.println("Digite um Número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um Segundo Número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma Operação Matemática");

        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("1. Multiplicação");
        System.out.println("1. Divisão");

        System.out.print("Opção: ");
        int operacao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch(operacao) {
            case 1:
                resultado = calc.somar(num1, num2);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                break;
            case 4:
                resultado = calc.multiplicar(num1, num2);
                break;
            default:
                System.out.println("Operação Inválida!!!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            char sinalMatematico = calc.sinalMatematico(operacao);
            System.out.println("\nResultado:");
            System.out.println(num1 + " " + sinalMatematico + " " + num2 + " = " + resultado);
        }

        scanner.close();
    }
}