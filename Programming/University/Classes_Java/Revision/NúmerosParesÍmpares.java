package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class NúmerosParesÍmpares {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    int par = 0;
    int impar = 0;

    System.out.println("Digite 10 números: ");

    for (int i = 0; i <= 9; i++) {
        System.out.println("Digite o " + (contador + 1) + "º número");
        int num = scanner.nextInt();

        contador++;

        if (num % 2 == 0) {
            par++;
        } else {
        impar++;
        }
              
    }
        
    System.out.println("Total de pares: " + par);
    System.out.println("Total de ímpares: " + impar);
    
    scanner.close();
    }
}