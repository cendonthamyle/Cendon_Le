package programming.university.javabelarmino.revision;

import java.util.Scanner;

public class Triângulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Triângulo");
        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))){
            System.out.print("É um triângulo ");
        }

        if (a == b && b == c) {
            System.out.println("equilátero");
        }

        if ((a == b) || (a == c) || (b == c)) {
            System.out.println("isósceles");
        }

        if ((a != b) && (b != c)) {
            System.out.println("escaleno");
        }
        scanner.close();
    }
}