

import java.util.Scanner;

public class Estruturas_Rep_Condicionais {

    //Estruturas If e Else: 
    public static void main1(String[] args) {
            boolean condicional = true; //exemplo de condição
       if (condicional == true) {
            //bloco de código a ser executado se a condição for verdadeira
        } else {
            //bloco de código a ser executado se a condição for falsa  
        }  
    }

    // If simples e If encadeado:
    // Exemplo de if encadeado:
    public static void main2(String[] args) {
        int numero = 10; //exemplo de número
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
    // Exemplo de if simples:
    public static void main3(String[] args) {
        int numero = 10; //exemplo de número
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }
    }
    /* Em Java, não é possível utilizar o operador de atribuição (=) 
     * dentro de uma estrutura condicional if, 
     * pois isso causaria um erro de compilação. 
     */

    // Exemplo Prático dado em aula:
    static class problem_NotaAluno {
        public static void mainP01(String[] args) {
            int nota;

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextInt();

            if(nota > 700 && nota <= 1000) {
                System.out.println("Aprovado");
            } else if (nota > 600 && nota <= 700) {
                System.out.println("Tem uma chance de passar!");
            } else if (nota > 0 && nota <= 600) {
                System.out.println("Provavelmente precisará fazer a prova novamente.");
            } else {
                System.out.println("Nota inválida.");
            }

            sc.close();
        }
    }

    // Operador Ternário:
    /* O operador ternário é uma forma concisa de escrever uma estrutura condicional if-else. 
     * Ele avalia a expressão booleana e retorna expressão1 se for verdadeira, 
     * ou expressão2 se for falsa.
     * (expressão booleana) ? expressão1 : expressão2;
     */
     // Exemplo prático do operador ternário:
        static class problem_OperadorTernario {
            public static void mainP02(String[] args) {
                int numero; //exemplo de número

                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um número: ");
                numero = sc.nextInt();

                String resultado = (numero % 2 == 0) ? "O número é par." : "O número é ímpar.";
                System.out.println(resultado);

                sc.close();
            }
        }

    //Switch Case:
    /* O switch case é uma estrutura de controle que permite selecionar um bloco de código 
     * a ser executado com base no valor de uma expressão. 
     * Ele é útil quando se tem várias condições para verificar, 
     * tornando o código mais legível e organizado.
     */
    // Exemplo prático do switch case:
    static class problem_SwitchCase_Meses {
        public static void mainP03(String[] args) {
            int mes; //exemplo de número do mês

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o número do mês (1-12): ");
            mes = sc.nextInt();

            String nomeMes;
            switch (mes) {
                case 1:
                    nomeMes = "Janeiro";
                    break;
                case 2:
                    nomeMes = "Fevereiro";
                    break;
                case 3:
                    nomeMes = "Março";
                    break;
                case 4:
                    nomeMes = "Abril";
                    break;
                case 5:
                    nomeMes = "Maio";
                    break;
                case 6:
                    nomeMes = "Junho";
                    break;
                case 7:
                    nomeMes = "Julho";
                    break;
                case 8:
                    nomeMes = "Agosto";
                    break;
                case 9:
                    nomeMes = "Setembro";
                    break;
                case 10:
                    nomeMes = "Outubro";
                    break;
                case 11:
                    nomeMes = "Novembro";
                    break;
                case 12:
                    nomeMes = "Dezembro";
                    break;
                default:
                    nomeMes = "Mês inválido.";
            }

            System.out.println("O mês correspondente é: " + nomeMes);

            sc.close();
        }
    }

    // Quando usar o switch case?
    /* O switch case é mais adequado quando se tem um número fixo de casos 
     * a serem verificados, especialmente quando esses casos são baseados em valores discretos, 
     * como números inteiros ou caracteres. 
     * Ele é mais legível e organizado do que uma série de if-else encadeados, 
     * tornando o código mais fácil de entender e manter. 
     * No entanto, para condições mais complexas ou quando se precisa verificar 
     * intervalos de valores, o if-else pode ser mais apropriado.
     */

    // Nova notação para o switch case:
    /* A partir do Java 14, foi introduzida uma nova notação para o switch case, 
     * que é mais concisa e legível. 
     * Ela permite usar a sintaxe de "case 1 ->" para indicar o início de um bloco de código, 
     * eliminando a necessidade de usar "break" para evitar a execução de casos subsequentes.
     * Além disso, permite atribuir o resultado diretamente a uma variável, 
     * tornando o código mais limpo e fácil de entender.
     */
    
    //Exemplo:
        public static void main5(String[] args) {
            int dia;

            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o número do dia da semana (1-7): ");
            dia = sc.nextInt();

            String nomeDia = switch (dia) {
                case 1 -> "Domingo";
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                case 7 -> "Sábado";
                default -> "Dia inválido.";
            };
            System.out.println("O dia correspondente é: " + nomeDia);
            sc.close();
        }

    // Estruturas de Repetição:
    /* As estruturas de repetição, como for, while e do-while,
     * são usadas para executar um bloco de código repetidamente 
     * enquanto uma condição for verdadeira. 
     * Elas são úteis para iterar sobre coleções, 
     * executar tarefas repetitivas ou criar loops infinitos.
     */
    // Exemplo prático de estrutura de repetição:
        static class problem_NotaAluno_Media {
            public static void mainP04(String[] args) {
                float nota1 = 0.0f, nota2 = 0.0f, media = 0.0f;

                Scanner sc = new Scanner(System.in);

                do {
                    System.out.print("Digite a primeira nota do aluno (0-10): ");
                    nota1 = sc.nextInt();

                    System.out.print("Digite a segunda nota do aluno (0-10): ");
                    nota2 = sc.nextInt();

                    media = (nota1 + nota2) / 2;
                    System.out.printf("A média do aluno é: %.2f\n " + media);

                } while (media != 0);

                sc.close();
            }
        }

    // Quando usar cada estrutura de repetição?
    /* O for é mais adequado quando se sabe o número exato de iterações ou quando se está iterando sobre uma coleção. 
     * O while é mais apropriado quando a condição de término não é conhecida de antemão e pode depender de fatores externos. 
     * O do-while é útil quando se deseja garantir que o bloco de código seja executado pelo menos uma vez, 
     * independentemente da condição inicial.
     */    
    
    // Exemplo prático:
        static class problem_NotaAluno_Media_FOR {
            public static void mainP05(String[] args) {
                float nota1 = 0.0f, nota2 = 0.0f, media = 0.0f;
                int alunos = 0;

                Scanner sc = new Scanner(System.in);

                for (int i = 0 ; i == 2; i++) {
                    System.out.print("Digite a primeira nota do aluno (0-10): ");
                    nota1 = sc.nextInt();

                    System.out.print("Digite a segunda nota do aluno (0-10): ");
                    nota2 = sc.nextInt();

                    media = (nota1 + nota2) / 2;
                    System.out.printf("A média do aluno é: %.2f\n " + media);
                    alunos = alunos + 1;
                }
                sc.close();
            }
        }

    // Comandos Break e Continue:
    /* São comandos que podem interromper ou alterar o fluxo de controle de estruturas de repetição e
     * condição como o switch, o while, e o for, por exemplo.
        * Break: É útil para parar a repetição de um laço sempre que o objetivo já tiver sido alcançado, 
        * poupando o computador de um processamento desnecessário.
        * 
        * Continue: Quando o comando continue é encontrado em um laço, 
        * a repetição atual é encerrada e a próxima é iniciada.
        * O comando continue é diferente de break porque ele não cancela todas as repetições, apenas a atual.
     */
    // Exemplo de Continue:
    public static void main6(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
            continue; // Skips the print statement when i is 3
            }
        System.out.print(i + " ");
        }
        // Output: 1 2 4 5
    }

    // Bloco e Escopo:
    /* Um bloco é um conjunto de uma ou mais instruções, envolvidas por chaves { }.
     * Uma variável que é declarada dentro de um bloco pode ser acessada somente dentro desse bloco. 
     * A isso chamamos de escopo de variável.
        * Ou seja,  escopo de variável é o nome dado ao trecho de código em que aquela variável existe 
        * e o lugar onde épossível acessá-la.
        * 
     * Blocos nos quais são executados ifs e if-elses, for, while e do-while, 
     * também definem o escopo de variáveis. 
     * Então, uma variável declarada dentro desses blocos não pode ser acessada de fora deles.
     */
    

}