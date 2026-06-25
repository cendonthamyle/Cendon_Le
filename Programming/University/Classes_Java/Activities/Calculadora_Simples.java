package Programming.University.Classes_Java.Activities;

import java.util.Scanner;

public class Calculadora_Simples {

    //Prática de Programação 3.1
    public static class P3_1{
        private double numero1;
        private double numero2;

        // 1. Métodos específicos: cada um cuida APENAS da sua própria operação
        public double somar(double a, double b) {
            return a + b;
        }

        public double subtrair(double a, double b) {
            return a - b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }

        public double dividir(double a, double b) {
            if (b == 0) {
                System.out.println(" Divisão por zero não é permitida!");
                return Double.NaN; 
            }
            return a / b;
        }

        // 2. Método geral: ele apenas guia a escolha do usuário para o método correto
        public double calcular(double num1, double num2, char operador) {
            this.numero1 = num1;
            this.numero2 = num2;

            switch (operador) {
                case '+': 
                 return somar(numero1, numero2);
                case '-': 
                    return subtrair(numero1, numero2);
                case '*': 
                    return multiplicar(numero1, numero2);
                case '/': 
                    return dividir(numero1, numero2);
                default:
                    System.out.println("Erro: Operador '" + operador + "' é inválido!");
                    return Double.NaN;
            }
        }
    }

    //Prática de Programação 3.2
    public static class P3_2{
        // 1. Métodos específicos: cada um cuida APENAS da sua própria operação
        public double somar(double a, double b) {
            return a + b;
        }

        public double subtrair(double a, double b) {
            return a - b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }

        public double dividir(double a, double b) {
            if (b == 0) {
                System.out.println(" Divisão por zero não é permitida!");
                return Double.NaN; 
            }
            return a / b;
        }

        // Método auxiliar para obter o símbolo da operação com base na escolha do menu
        public char getSimbolo(int opcao) {
            switch (opcao) {
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                default: return '?';
            }
        }

        public static void main(String[] args) {
            // Inicialização do Scanner e da Calculadora
            Scanner scanner = new Scanner(System.in);
            P3_2 calc = new P3_2();

            // 1. Entrada dos números (operandos)
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // 2. Exibição do Menu de Opções
            System.out.println("\nEscolha a operação desejada:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            double resultado = 0;
            boolean opcaoValida = true;

            // 3. Processamento da escolha com controle condicional
            switch (opcao) {
                case 1:
                    resultado = calc.somar(num1, num2);
                    break;
                case 2:
                    resultado = calc.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calc.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calc.dividir(num1, num2);
                    if (Double.isNaN(resultado)) {
                        opcaoValida = false; // Cancela a exibição se houver erro de divisão por zero
                    }   
                    break;
                default:
                    System.out.println("Erro: Opção inválida!");
                    opcaoValida = false;
                }

            // 4. Exibição do resultado final formatado (Ex: 10.0 / 2.0 = 5.0)
            if (opcaoValida) {
                char simbolo = calc.getSimbolo(opcao);
                System.out.println("\nResultado:");
                System.out.println(num1 + " " + simbolo + " " + num2 + " = " + resultado);
            }

            scanner.close();
        }
    }

    //Prática de Programação 3.3
    public static class P3_3{
        public double somar(double a, double b) {
            return a + b;
        }

        public double subtrair(double a, double b) {
            return a - b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }

        public double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero não é permitida!");
                return Double.NaN;
            }
            return a / b;
        }

        public char getSimbolo(int opcao) {
            switch (opcao) {
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                default: return '?';
            }
        }

        public static class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                P3_3 calc = new P3_3();
        
            int opcao;

            // O laço 'do-while' vai repetir todo o bloco abaixo
            do {
                System.out.println("\n=== Escolha uma Operação Matemática ===");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. SAIR");
                System.out.print("Escolha a opção desejada: ");
                opcao = scanner.nextInt();

                // Se o usuário digitou 5, o programa pula o cálculo e vai para o fim
                if (opcao == 5) {
                    break; 
                }

                // Verifica se a opção digitada é inválida (menor que 1 ou maior que 5)
                if (opcao < 1 || opcao > 5) {
                    System.out.println("Erro: Opção inválida! Tente novamente.");
                    continue; // Volta para o início do laço e mostra o menu de novo
                }

                // Se a opção for válida (1 a 4), pedimos os números
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean exibirResultado = true;

                // Processamento da escolha
                switch (opcao) {
                    case 1:
                        resultado = calc.somar(num1, num2);
                        break;
                    case 2:
                        resultado = calc.subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = calc.multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = calc.dividir(num1, num2);
                        if (Double.isNaN(resultado)) {
                            exibirResultado = false; // Não exibe o formato caso dê divisão por zero
                        }
                        break;
                }

                // Exibição do resultado formatado
                if (exibirResultado) {
                    char simbolo = calc.getSimbolo(opcao);
                    System.out.println("\n-----------------------------");
                    System.out.println("Resultado: " + num1 + " " + simbolo + " " + num2 + " = " + resultado);
                    System.out.println("-----------------------------");
                }

            } while (opcao != 5); // O laço continua rodando ENQUANTO a opção for diferente de 5

            scanner.close();
            }
        }
    }

    //Prática de Programação 3.4
    public static class P3_4 {
        public double somar(double a, double b) {
            return a + b;
        }

        public double subtrair(double a, double b) {
            return a - b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }

        public double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero não é permitida!");
                return Double.NaN;
            }
            return a / b;
        }

        public char getSimbolo(int opcao) {
            switch (opcao) {
                case 1: return '+';
                case 2: return '-';
                case 3: return '*';
                case 4: return '/';
                default: return '?';
            }
        }
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            P3_4 calc = new P3_4();
        
            // Estrutura para o Histórico Circular
            String[] historico = new String[5];
            int totalOperacoes = 0; // Conta quantas operações foram feitas no total

            int opcao;

            do {
                System.out.println("\n=== Escolha uma Operação Matemática ===");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. SAIR");
                System.out.println("6. Ver Histórico (Últimas 5)");
                System.out.print("Escolha a opção desejada: ");
                opcao = scanner.nextInt();

                // Opção de Sair
                if (opcao == 5) {
                    break; 
                }

                // Opção de Visualizar o Histórico
                if (opcao == 6) {
                    System.out.println("\n=== HISTÓRICO DE OPERAÇÕES ===");
                    if (totalOperacoes == 0) {
                        System.out.println("Nenhuma operação realizada ainda.");
                    } else {
                        // Mostra até 5 itens. Se fez menos de 5, mostra só os que existem.
                        int itensParaMostrar = Math.min(totalOperacoes, 5);
                        for (int i = 0; i < itensParaMostrar; i++) {
                            // Lógica para mostrar na ordem correta dependendo de onde o ponteiro circular está
                            int indice = (totalOperacoes < 5) ? i : (totalOperacoes - itensParaMostrar + i) % 5;
                            System.out.println((i + 1) + ". " + historico[indice]);
                        }
                    }
                    continue; // Volta para o menu
                }

                // Validação de opções incorretas
                if (opcao < 1 || opcao > 6) {
                    System.out.println("Erro: Opção inválida! Tente novamente.");
                    continue;
                }

                // Entrada dos números para as operações (1 a 4)
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;
                boolean exibirResultado = true;

                switch (opcao) {
                    case 1:
                        resultado = calc.somar(num1, num2);
                        break;
                    case 2:
                        resultado = calc.subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = calc.multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = calc.dividir(num1, num2);
                        if (Double.isNaN(resultado)) {
                            exibirResultado = false;
                        }
                        break;
                }

                // Exibição e gravação no Histórico Circular (FIFO)
                if (exibirResultado) {
                    char simbolo = calc.getSimbolo(opcao);
                    String linhaOperacao = num1 + " " + simbolo + " " + num2 + " = " + resultado;
                
                    System.out.println("\n-----------------------------");
                    System.out.println("Resultado: " + linhaOperacao);
                    System.out.println("-----------------------------");

                    int indiceCircular = totalOperacoes % 5;
                    historico[indiceCircular] = linhaOperacao;
                    totalOperacoes++; // Incrementa o total geral de operações
                }

            } while (opcao != 5);

            scanner.close();
        }
    }       
}