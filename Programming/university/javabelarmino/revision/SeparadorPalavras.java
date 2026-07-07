package programming.university.javabelarmino.revision;

import java.util.Scanner;

public class SeparadorPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 4.1 Recebe 10 palavras digitadas pelo usuário
        String[] todasPalavras = new String[10];
        System.out.println("Digite 10 palavras:");
        for (int i = 0; i < todasPalavras.length; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            todasPalavras[i] = scanner.next();
        }

        // Arrays temporários de tamanho 10 para garantir espaço
        String[] tempGrandes = new String[10];
        String[] tempPequenas = new String[10];
        
        int contGrandes = 0;
        int contPequenas = 0;

        // 4.2 Separa as palavras com base no tamanho (7 caracteres)
        for (int i = 0; i < todasPalavras.length; i++) {
            if (todasPalavras[i].length() > 7) {
                tempGrandes[contGrandes] = todasPalavras[i];
                contGrandes++;
            } else {
                tempPequenas[contPequenas] = todasPalavras[i];
                contPequenas++;
            }
        }

        // Criando os arrays finais com o tamanho exato que precisamos
        String[] grandesFinais = new String[contGrandes];
        String[] pequenasFinais = new String[contPequenas];

        // Copiando os dados dos arrays temporários para os finais
        System.arraycopy(tempGrandes, 0, grandesFinais, 0, contGrandes);
        System.arraycopy(tempPequenas, 0, pequenasFinais, 0, contPequenas);

        // 4.3 Chamada dos métodos estáticos para exibir os resultados
        System.out.println("\n=================================");
        palavrasGrandes(grandesFinais);
        System.out.println("=================================");
        palavrasPequenas(pequenasFinais);
        
        scanner.close();
    }

    // Método para imprimir as palavras maiores que 7 caracteres
    public static void palavrasGrandes(String[] arr) {
        System.out.println("Palavras Grandes (Mais de 7 caracteres):");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("- " + arr[i] + " (Tamanho: " + arr[i].length() + ")");
        }
        System.out.println("Quantidade total de palavras grandes: " + arr.length);
    }

    // Método para imprimir as palavras com 7 ou menos caracteres
    public static void palavrasPequenas(String[] arr) {
        System.out.println("Palavras Pequenas (7 ou menos caracteres):");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("- " + arr[i] + " (Tamanho: " + arr[i].length() + ")");
        }
        System.out.println("Quantidade total de palavras pequenas: " + arr.length);
    }
}