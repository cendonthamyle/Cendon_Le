package programming.university.javabelarmino.revision;

import java.util.Scanner;

public class ChatFIFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array fixo para armazenar as 5 mensagens
        String[] historico = new String[5];
        int totalMensagensEnviadas = 0; // Contador global para o ID da mensagem (Mensagem X)
        int mensagensNoArray = 0;       // Quantidade de mensagens atualmente guardadas (máximo 5)

        System.out.println("--- Sistema de Chat Local (FIFO) ---");
        System.out.println("Digite suas mensagens abaixo. Digite 'sair' para encerrar.");
        System.out.println("-----------------------------------------------------");

        while (true) {
            System.out.print("Digite uma mensagem: ");
            String texto = scanner.nextLine();

            // Condição de parada
            if (texto.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o chat. Até logo!");
                break;
            }

            // Incrementa o contador total de mensagens criadas
            totalMensagensEnviadas++;
            String mensagemFormatada = "Mensagem " + totalMensagensEnviadas + ": [" + texto + "]";

            // REGRA FIFO: Verificar se o array está cheio
            if (mensagensNoArray < 5) {
                // Se ainda tem espaço, adiciona direto no próximo índice livre
                historico[mensagensNoArray] = mensagemFormatada;
                mensagensNoArray++;
            } else {
                // Se está cheio, desloca todo mundo para a esquerda (descarta o índice 0)
                for (int i = 0; i < 4; i++) {
                    historico[i] = historico[i + 1];
                }
                // Coloca a nova mensagem na última posição que liberou (índice 4)
                historico[4] = mensagemFormatada;
            }

            // Exibe o histórico atualizado
            System.out.println("\nHistórico (" + mensagensNoArray + " mensagens mais recentes):");
            for (int i = 0; i < mensagensNoArray; i++) {
                System.out.println(historico[i]);
            }
            System.out.println("-----------------------------------------------------");
        }

        scanner.close();
    }
}