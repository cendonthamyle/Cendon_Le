package Programming.University.Classes_Java.Revision;

import java.util.Locale;
import java.util.Scanner;

public class Verificador_Notas {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um Número:");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida!");
        } else if (nota == Math.floor(nota)) {
            int notaInteira = (int) nota;

            switch (notaInteira) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Reprovado");
                    break;
                case 5:
                case 6:
                    System.out.println("Recuperação");
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Aprovado");
                    break;
            }
            
        } else {
            if (nota >= 8.5) {
                System.out.println("Aprovado com mérito");
            } else if (nota >= 7) {
                System.out.println("Aprovado");
            } else if (nota >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
        scanner.close();
    }
}