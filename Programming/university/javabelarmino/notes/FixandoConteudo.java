package programming.university.javabelarmino.notes;


import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FixandoConteudo {

    //Exercício 1 - Calculo do IMC
    static class problem_CalculoIMC {
        public static void main(String[] args) {
            float peso, altura, IMC;
                peso = 49.5f; //peso em kg
                altura = 1.71f; //altura em metros
            IMC = peso / (altura * altura);

            System.out.println("O seu IMC é: " + IMC);
        }
    }


    //Exercício 2 - Formatação de números
    static class problem_FormataçãoNumeros {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            String product1 = "Computer";
            String product2 = "Office desk";
            int age = 30;
            int code = 5290;
            char gender = 'F';
            double price1 = 2100.0;
            double price2 = 650.50;
            double measure = 53.234567;

            System.out.println("Products: \n");
            System.out.printf(product1 + ", which price is $%.2f ", price1);
            System.out.printf(product2 + ", which price is $%.2f ", price2);
            System.out.printf("\nRecord: %d years old, code %d and gender:%c ", age, code, gender);
            System.out.println();
            System.out.printf("Measure with eight decimal places: %.8f", measure);
            System.out.printf("\nRounded (three decimal places): %.3f", measure);
            System.out.printf("\nUS decimal point: %.3f", measure);
        }
    }


    //Exercício 3 - JOptionPane
    static class problem_JOptionPane {
        public static void main(String[] args) {
            int a,b = 0;

            String entrada = JOptionPane.showInputDialog("Digite o valor da variável a:");
            a = Integer.parseInt(entrada);

            entrada = JOptionPane.showInputDialog("Digite o valor da variável b:");
            b = Integer.parseInt(entrada);

            System.out.println(a);
            int resultado = a*b;
            JOptionPane.showMessageDialog(null,a + " multiplicado por "+ b +" é igual à: "+ resultado);
        }
    }


    //Exercício 4 - Gastos
    static class problem_Gastos {
        public static void main(String[] args) {
            double gastos_janeiro = 15000.0;
            double gastos_fevereiro = 23000.0;
            double gastos_marco = 17000.0;

            double totalGasto = gastos_janeiro + gastos_fevereiro + gastos_marco;
            double mediaGasto = totalGasto / 3;

            System.out.println("O total gasto nesse trimestre é: R$ " + totalGasto);
            System.out.println("A média de gastos mensal é: R$ " + String.format("%.2f", mediaGasto));
        }
    }


    //Exercício 5 - JOptionPane - Calculadora de Desconto
    static class problem_CalculadoraDesconto {
        public static void main(String[] args) {
            double ValorProduto, PercentualDesconto;

            String entrada = JOptionPane.showInputDialog("Digite o valor do produto:");
            ValorProduto = Double.parseDouble(entrada);

            String entrada2 = JOptionPane.showInputDialog("Digite o percentual de desconto:");
            PercentualDesconto = Double.parseDouble(entrada2);

            double ValorDesconto = ValorProduto * (PercentualDesconto / 100);
            double ValorComDesconto = ValorProduto - ValorDesconto;

            JOptionPane.showMessageDialog(null, "O valor do desconto é: R$ " + String.format("%.2f", ValorDesconto));
            JOptionPane.showMessageDialog(null, "O valor com desconto é: R$ " + String.format("%.2f", ValorComDesconto));
        }
    }


    //Exercício 6 - Scanner e Brasileirão
    static class problem_Brasileirao {
        public static void main(String[] args) {
            int PontosLider, PontosLanterna;

            Scanner.class.getResourceAsStream("problem_Brasileirao.java");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite os pontos do líder do Campeonato Brasileiro: ");
            PontosLider = scanner.nextInt();

            System.out.print("Digite os pontos do time lanterna do Campeonato Brasileiro: ");
            PontosLanterna = scanner.nextInt();

            // Calcular quantos pontos o lanterna precisa para alcançar ou ultrapassar o líder
            int VitoriasAlcançadas = 0;
            int VitoriasNecessarios = 0;

            int PontosAlcançar = PontosLanterna;
            int PontosUltrapassar = PontosLanterna;
            
            // Loop para ALCANÇAR
            for (int i = 1; i <= 38; i++) {
                if (PontosAlcançar < PontosLider) {
                    PontosAlcançar += 3; // Lanterna ganha 3 pontos
                    VitoriasAlcançadas++;          // Conta uma vitória
                } else {
                    break; // Já alcançou ou passou, interrompe o loop
                }
            }

            // Loop para ULTRAPASSAR
            for (int i = 1; i <= 38; i++) {
                if (PontosUltrapassar <= PontosLider) {
                    PontosUltrapassar += 3; // Lanterna ganha 3 pontos
                    VitoriasNecessarios++;           // Conta uma vitória
                } else {
                    break; // Já ultrapassou (ficou maior), interrompe o loop
                }
            }
                
            // Agora exibimos os resultados na tela
            System.out.println("Para alcançar o líder são necessárias: " + VitoriasAlcançadas + " vitórias.");
            System.out.println("Para ultrapassar o líder são necessárias: " + VitoriasNecessarios + " vitórias.");

            scanner.close();
                 
        }
    }
    
}
