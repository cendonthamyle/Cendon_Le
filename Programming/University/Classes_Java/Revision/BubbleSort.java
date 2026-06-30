package Programming.University.Classes_Java.Revision;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;

        while(true) {
            System.out.print("Digite o número de elementos para o array (máximo 50): ");
            tamanho = scanner.nextInt();

            if (tamanho > 0 && tamanho <= 50) {
                break;
            }
            System.out.println("Por favor, digite um número válido entre 1 e 50.");
        }

        int[] array = new int[tamanho];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.print("Array desordenado: ");
        exibirArray(array);
        System.out.print("]");
        System.out.println();
        
        bubbleSort(array);
        System.out.print("Array ordenado: ");
        exibirArray(array);
        System.out.print("]");

        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } 
    }

    public static void exibirArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    
}