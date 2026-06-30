package Programming.University.Classes_Java.Exam;

import java.util.Scanner;

public class Exam_1 {
    // Parte 1: Patinhos Nadando na Lagoa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        for(int i = n; i >= 1; i--) {

            if(i == 1) {
                System.out.println("1 patinho nadando na lagoa");
            } else {
                System.out.print(i + " ");
                
                for(int patinhos = 0; patinhos < i; patinhos++){
                    System.out.print("patinhos ");
                }
            
                System.out.println("nadando na lagoa"); 
            }
        }
        scanner.close();
    }
}