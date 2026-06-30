package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = scanner.nextInt();

        System.out.println("Essa é a tabuado do " + n + "\n");

        for(int i = 0; i <= 10; i++) {
            int resultado = n * i;

            if (resultado % 2 == 0) {
                System.out.println(resultado);
            }
        }
        scanner.close();
    }
}
