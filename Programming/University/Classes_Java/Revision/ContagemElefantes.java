package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class ContagemElefantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        for(int i = num; i >= 1; i--) {

            if(i == 1) {
                System.out.println("1 elefante incomoda");
            } else {
                System.out.print(i + " ");
                
                for(int elefantes = 0; elefantes < i; elefantes++){
                    System.out.print("elefantes ");
                }
            
                System.out.println("incomodam"); 
            }
        }
        scanner.close();
    }
}