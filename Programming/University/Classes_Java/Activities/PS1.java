package Programming.University.Classes_Java.Activities;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PS1 {
    public static class PS1_1 {
        public static void main(String[] args) {
            for (int i = 700; i >= 510; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static class PS1_2 {
        public static void main(String[] args) {
            System.out.println("Múltiplos de 3 entre 1 e 100:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }  
    }


    public static class PS1_3 {
        public static void main(String[] args) {
            long fatorial = 1;

            for (int n = 0; n <= 10; n++) {
                if (n == 0) {
                    fatorial = 1;
                } else {
                    fatorial = fatorial * n;
                }
                System.out.println("O fatorial de " + n + " é: " + fatorial);
            }
        }
    }
    

    // Classe utilizada para o PS1_4
        static class MonitoramentoAmbiental {
            // Atributos para armazenar os valores calculados
            private double th; // Temperatura mais Alta
            private double tl; // Temperatura mais Baixa
            private double tm; // Média das Temperaturas
            private double tt; // Soma Total

            // Método que processa os dados dos sensores e calcula as métricas
            public void analisarTemperaturas(double t1, double t2, double t3, double t4) {
                // 1. Calcula a Soma Total (TT)
                this.tt = t1 + t2 + t3 + t4;

                // 2. Calcula a Média (TM)
                this.tm = this.tt / 4;

                // 3. Encontra a Temperatura Mais Alta (TH) usando Math.max
                this.th = Math.max(Math.max(t1, t2), Math.max(t3, t4));

                // 4. Encontra a Temperatura Mais Baixa (TL) usando Math.min
                this.tl = Math.min(Math.min(t1, t2), Math.min(t3, t4));
            }   

            // Métodos para exibir ou pegar os resultados
            public void exibirRelatorio() {
                System.out.println("\n=== RELATÓRIO TÉRMICO DO AMBIENTE ===");
                System.out.println("Soma Total das Temperaturas (TT): " + this.tt + "°C");
                System.out.println("Média das Temperaturas (TM): " + this.tm + "°C");
                System.out.println("Temperatura Mais Alta (TH): " + this.th + "°C");
                System.out.println("Temperatura Mais Baixa (TL): " + this.tl + "°C");
            }
        }


    public static class PS1_4 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                MonitoramentoAmbiental monitor = new MonitoramentoAmbiental();

                System.out.println("=== SISTEMA DE MONITORAMENTO AMBIENTAL ===");
        
                // Entrada de dados dos 4 sensores
                System.out.print("Digite a temperatura do Sensor 1 (T1): ");
                double t1 = scanner.nextDouble();

                System.out.print("Digite a temperatura do Sensor 2 (T2): ");
                double t2 = scanner.nextDouble();

                System.out.print("Digite a temperatura do Sensor 3 (T3): ");
                double t3 = scanner.nextDouble();

                System.out.print("Digite a temperatura do Sensor 4 (T4): ");
                double t4 = scanner.nextDouble();

                // Executa a análise dos dados informados
                monitor.analisarTemperaturas(t1, t2, t3, t4);

                // Exibe o resultado final formatado
                monitor.exibirRelatorio();

                scanner.close();
            }
    }


    public static class PS1_5 {
        public static void main(String[] args) {
            String resposta;

            do {
                // 1. Entrada de dados via JOptionPane (retorna uma String)
                String inputCelsius = JOptionPane.showInputDialog(
                    null, 
                    "Digite a temperatura em Celsius (°C):", 
                    "Conversor de Temperatura", 
                    JOptionPane.QUESTION_MESSAGE
                );

                // Caso o usuário clique em "Cancelar" ou feche a janela, o programa encerra com segurança
                if (inputCelsius == null) {
                    break;
                }

                // 2. Conversão da String digitada para o tipo double
                double celsius = Double.parseDouble(inputCelsius);

                // 3. Aplicação da fórmula de conversão: F = 9 * C / 5 + 32
                double fahrenheit = (9.0 * celsius / 5.0) + 32.0;

                // 4. Exibição do resultado em uma caixa de mensagem
                String mensagemResultado = String.format(
                    "Temperatura em Celsius: %.1f°C\nEquivalente em Fahrenheit: %.1f°F", 
                    celsius, fahrenheit
                );
            
                JOptionPane.showMessageDialog(
                    null, 
                    mensagemResultado, 
                    "Resultado da Conversão", 
                    JOptionPane.INFORMATION_MESSAGE
                );

                // 5. Pergunta se o usuário deseja repetir (s/n)
                resposta = JOptionPane.showInputDialog(
                    null, 
                    "Deseja repetir (s/n)?", 
                    "Continuar?", 
                    JOptionPane.QUESTION_MESSAGE
                );

                // Se o usuário fechar a janela de repetição, define como vazia para sair do laço
                if (resposta == null) {
                    resposta = "n";
                }

            } while (resposta.equalsIgnoreCase("s")); // Repete se for "s" ou "S"

            // Mensagem final de encerramento
            JOptionPane.showMessageDialog(
                null, 
                "Programa encerrado. Até logo!", 
                "Fim", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}

