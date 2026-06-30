package Programming.University.Classes_Java.Revision;

public class OperacoesMatrizes {
    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 3;

        // I. Inicialização e preenchimento automático da Matriz A
        int[][] matrizA = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                // Math.random() * 201 gera de 0.0 a 200.999...
                // Subtraindo 100, o intervalo muda para -100.0 a 100.999...
                // O cast para (int) trunca o valor, resultando no intervalo inclusivo [-100, 100]
                matrizA[i][j] = (int) (Math.random() * 201) - 100;
            }
        }

        // II. Matriz B fixa definida no código
        int[][] matrizB = {
            { 2, -3, 5 },
            { -1, 4, 0 },
            { 7, 8, -6 },
            { 9, -2, 1 }
        };

        // Inicialização das matrizes de resultado (S, D, M)
        int[][] matrizS = new int[linhas][colunas];
        int[][] matrizD = new int[linhas][colunas];
        int[][] matrizM = new int[linhas][colunas];

        // III. Cálculos das matrizes S, D e M
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j];      // A. Soma
                matrizD[i][j] = matrizA[i][j] - matrizB[i][j];      // B. Subtração
                matrizM[i][j] = matrizA[i][j] * matrizB[i][j];      // C. Multiplicação elemento a elemento
            }
        }

        // IV. Exibição organizada de todas as matrizes
        System.out.println("=== MATRIZ A (Aleatória) ===");
        exibirMatriz(matrizA);

        System.out.println("\n=== MATRIZ B (Fixa) ===");
        exibirMatriz(matrizB);

        System.out.println("\n=== MATRIZ S (A + B) ===");
        exibirMatriz(matrizS);

        System.out.println("\n=== MATRIZ D (A - B) ===");
        exibirMatriz(matrizD);

        System.out.println("\n=== MATRIZ M (A * B elemento a elemento) ===");
        exibirMatriz(matrizM);
    }

    // Método auxiliar para imprimir as matrizes alinhadas em formato de tabela
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Usando o printf com "%6d" para garantir que cada número ocupe 6 espaços.
                // Isso mantém as colunas perfeitamente alinhadas, mesmo com números negativos ou grandes.
                System.out.printf("%6d ", matriz[i][j]);
            }
            System.out.println(); // Quebra de linha ao fim de cada linha da matriz
        }
    }
}