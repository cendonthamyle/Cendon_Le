package Programming.University.Classes_Java.Activities;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        int tamanho = 0;
       // boolean flag = false;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("digite o tamanho da matriz QUADRADA");
        while(tamanho < 2  || tamanho > 5){
        tamanho = Teclado.nextInt();
        Teclado.nextLine();
        
        if (tamanho < 2 || tamanho > 5){
            System.out.println("não aceitamos esse tipo de valor.");
            } else {
            continue;
            }
        }

        int[][] matriz = new int[tamanho][tamanho];
        int[][] transposta = new int[tamanho][tamanho];
        System.out.println("sua matriz foi criada!");


        matriz = EncheMatriz(matriz, tamanho);

        PrintMatriz(matriz, tamanho);

        System.out.println("transposta: ");
        transposta = TranspostaMatriz(matriz, tamanho);

        PrintMatriz(transposta, tamanho);

        int diagonal_principal = diagonalp(matriz, tamanho);
        System.out.println("a diagonal principal é: " + diagonal_principal);

        int diagonal_secundaria = diagonalsec(matriz, tamanho);
        System.out.println("a diagonal secundaria é: " + diagonal_secundaria);

        int det = Determinante(matriz,tamanho); 
        System.out.println("o determinante da sua matriz é: " + det);

        Teclado.close();  
    }

    public static int randomProbabilidadeZero(){
        int chance = (int)(Math.random() * 4);
        if (chance == 0){
            return 0;
        }
        return (int)(Math.random() *21) - 10;
    }

    public static int[][] EncheMatriz(int[][] matriz, int tamanho){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] = randomProbabilidadeZero();
            }
        }

        return matriz;    
    }

    public static void PrintMatriz(int[][] matriz, int tamanho){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] TranspostaMatriz(int[][] matriz, int tamanho){
        int[][] Transposta = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                Transposta[j][i] = matriz[i][j];
            }
        }

        return Transposta;
    }

    public static int Determinante(int[][] matriz, int tamanho){
        switch (tamanho){
            case 2: return Determinante2por2(matriz);
            case 3: return Determinante3por3(matriz);
            case 4: return Determinante4por4(matriz);
            case 5: return Determinante5por5(matriz);
            default: return 0;
        }
    }

    public static int Determinante2por2(int[][] matriz){
        int determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        return determinante;
    }

    public static int Determinante3por3(int[][] matriz){
        int a = (matriz[0][0] * matriz[1][1] * matriz[2][2]);
        int b = (matriz[0][1] * matriz[1][2] * matriz[2][0]);
        int c = (matriz[0][2] * matriz[1][0] * matriz[2][1]);
        int d = (matriz[0][1] * matriz[1][0] * matriz[2][2]);
        int e = (matriz[0][0] * matriz[1][2] * matriz[2][1]);
        int f = (matriz[0][2] * matriz[1][1] * matriz[2][0]);
        int determinante = (a+b+c) - (d+e+f);
        return determinante;
    }

    // Atividade EXTRA:
    public static int Determinante4por4(int[][] matriz){
        int determinante = 0;
        for (int coluna = 0; coluna < 4; coluna++){
            int sinal = (coluna % 2 == 0) ? 1 : -1;
            determinante += sinal * matriz[0][coluna] * Determinante3por3(Submatriz(matriz, 0, coluna, 4));
        }
        return determinante;
    }

    public static int Determinante5por5(int[][] matriz){
         int determinante = 0;
        for (int coluna = 0; coluna < 5; coluna++){
            int sinal = (coluna % 2 == 0) ? 1 : -1;
            determinante += sinal * matriz[0][coluna] * Determinante4por4(Submatriz(matriz, 0, coluna, 5));
        }
        return determinante;
    }

    public static int[][] Submatriz(int[][] matriz, int linhaRemovedor, int colunaRemovedor, int tamanho){
        int [][] sub = new int[tamanho - 1][tamanho -1];
        int ri = 0;
        int rj = 0;

        for (int i = 0; i < tamanho; i++){
            if (i == linhaRemovedor){
                continue;
            }
            for (int j = 0; j < tamanho; j++){
                if (j == colunaRemovedor){
                    continue;
                }
                sub [ri][rj++] = matriz[i][j];
            
            }
            ri++;
            rj = 0;
        }
        return sub;
    }


    public static int diagonalp(int[][] matriz, int tamanho){
        int soma = 0;
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if(i == j){
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    }

    public static int diagonalsec(int[][]matriz, int tamanho){
        int soma = 0;
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if(i + j == tamanho - 1){
                    soma += matriz[i][j];
                }
            }       
        }
        return soma;
    }
}