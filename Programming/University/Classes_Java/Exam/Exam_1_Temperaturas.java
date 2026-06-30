package Programming.University.Classes_Java.Exam;

import java.util.Scanner;

public class Exam_1_Temperaturas {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperaturas = new int[10];

        System.out.println("Digite 10 temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }

        // Arrays temporários de tamanho 10 para garantir espaço
        int[] diasQuentes = new int[10];
        int[] diasFrios = new int[10];
        
        int contQuentes = 0;
        int contFrios = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] >= 20) {
                diasQuentes[contQuentes] = temperaturas[i];
                contQuentes++;
            } else {
                diasFrios[contFrios] = temperaturas[i];
                contFrios++;
            }
        }

        // Arrays finais com o tamanho exato dos dias encontrados
        int[] quentesFinais = new int[contQuentes];
        int[] friosFinais = new int[contFrios];


        System.arraycopy(diasQuentes, 0, quentesFinais, 0, contQuentes);
        System.arraycopy(diasFrios, 0, friosFinais, 0, contFrios);

        //Chamada dos métodos para exibir os resultados
        System.out.println("\n");
        diasQuentes(quentesFinais);
        
        System.out.println("\n");
        diasFrios(friosFinais);
        
        scanner.close();
    }

    public static void diasQuentes(int[] arr) {
        System.out.println("Cada temperatura e sua classificação:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Temperatura " + arr[i] + "°C: ");
            if (arr[i] >= 20 && arr[i] <= 25) {
                System.out.println("Ameno");
            } else if (arr[i] >= 26 && arr[i] <= 35) {
                System.out.println("Quente");
            } else if (arr[i] >= 36) {
                System.out.println("Muito Quente");
            }
        }
    }

    public static void diasFrios(int[] arr) {
        System.out.println("Quantidade total de dias frios: " + arr.length);

        if (arr.length == 0) {
            System.out.println("Nenhum dia frio foi registrado.");
        }
        int menorTemperatura = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menorTemperatura) {
                menorTemperatura = arr[i];
            }
        }

        System.out.println("A menor temperatura encontrada: " + menorTemperatura + "°C");
    }
}  