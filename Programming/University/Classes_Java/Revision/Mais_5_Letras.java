package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class Mais_5_Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Criamos um array de String para armazenar as 6 palavras
        String[] palavras = new String[6];

        // 2. Laço para ler as 6 palavras do usuário
        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = scanner.next();
        }

        System.out.println("\nPalavras com mais de 5 letras:");

        // 3. Laço para verificar o tamanho de cada palavra armazenada
        for (int i = 0; i < palavras.length; i++) {
            // O método .length() conta a quantidade de caracteres da String
            if (palavras[i].length() > 5) {
                System.out.println(palavras[i]);
            }
        }

        scanner.close();
    }
}
