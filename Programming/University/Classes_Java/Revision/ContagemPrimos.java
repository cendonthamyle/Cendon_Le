package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class ContagemPrimos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número limite para determinar o intervalo: ");
        int numeroLimite = scanner.nextInt();
        int primos = 0;

        for(int atual = 2; atual <= numeroLimite; atual++) {
            boolean ehPrimo = true;

            for(int i = 2; i * i <= atual; i++){
                if(atual % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            if(ehPrimo) {
                primos++;
            }
        }
        System.out.println(" O total de números primos nesse intervalo é: " + primos);
        scanner.close();
    }
}