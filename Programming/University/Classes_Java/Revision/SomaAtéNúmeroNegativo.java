package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class SomaAtéNúmeroNegativo {
    public static void main(String[] args) {
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        while(num >= 0) {
            soma += num;

            System.out.println("Digite o próximo número: ");
            num = scanner.nextInt();
        }
        System.out.println("O total acumulado é: " + soma);

        scanner.close();
    }
}