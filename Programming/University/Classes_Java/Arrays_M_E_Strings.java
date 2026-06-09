package Programming.University.Classes_Java;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Arrays_M_E_Strings {
    
    /* Arrays:
     * Unidimensionais: Possuem apenas um índice para acessar seu conteúdo.
        * TipoDeDado[] nomeDoArray = new TipoDeDado[quant];
            * int[] pontuacao = new int[10];
            * double[] precos = new double[5]; 
            * char[] sexo = new char[2];
            * String[] meses = new String [12];
     * Os Arrays podem ser iniciado e criados da seguinte forma também:
        * int[] pontuacao =
        * {1,2,3,4,5,6,7,,8,9,10};
     * Cada elemento do array pode ser utilizado individualmente de forma direta, 
     * ou seja, pode ser lido ou escrito diretamente, sem nenhuma regra ou ordem 
     * preestabelecida, fazendo do array, uma estrutura de dados de acesso aleatório.
     * 
     * Bidimensionais: Possui dois índices ou mais e possibilita que os valores 
     * sejam armazenados na forma de matrizes.
     * Deve-se indicar a posição que será armazenado o valor.
        * int tabuleiro[][] = new int [3][3]; 
     */

    // Exemplo: 
    public static void main1 (String[] args) {
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if (arrayDois.length >=8) {
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
    }

    // Exemplo: 
    public static void main2(String[] args){
        int[][] matriz = new int[2][2];
        matriz[0][0] = 120;
        matriz[0][1] = 232;
        matriz[1][0] = 129;
        matriz[1][1] = 111;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("matriz["+linha+"),"+coluna+"]=" + matriz[linha][coluna]);
            }
        }
    }

    // Busca em um Array:
    static class Busca_Array {
        public static void main (String[] args) {
            String[] cores = {"verde", "vermelho", "azul", "amarelo", "preto"};

            String cor = JOptionPane.showInputDialog("Escolha uma cor: ");
            String msg = "Cor não encontrada";

            for (String elemento : cores) {
                if (elemento.equalsIgnoreCase(cor)) {
                    msg = "Cor encontrada";
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, msg);
        } 
    
        
    }

    /* Funções:
     ● Representam um processamento que possui um significado
        ○ Math.sqrt(double)
        ○ System.out.println(string)
     ● Principais vantagens: modularização, delegação e reaproveitamento
        ○ A modularização consiste em dividir um sistema complexo em partes 
          menores e independentes (métodos, classes e pacotes).
        ○ A delegação ocorre quando um objeto não executa uma tarefa complexa 
          por conta própria, mas sim "delega" (passa a responsabilidade) para outro 
          objeto ou método especializado.Isso reduz o acoplamento e obedece ao 
          princípio da responsabilidade única.
        ○ O reaproveitamento é a capacidade de utilizar o mesmo bloco de código 
          (ou classe) em várias partes do sistema, sem precisar reescrevê-lo.
          Na Programação Orientada a Objetos (POO), o reaproveitamento é fortemente 
          impulsionado pela Herança e pelo Polimorfismo, onde classes filhas aproveitam 
          comportamentos da classe mãe.
     ● Dados de entrada e saída
        ○ Funções podem receber dados de entrada (parâmetros ou argumentos)
        ○ Funções podem ou não retornar uma saída
     ● Em orientação a objetos, funções em classes recebem o nome de "métodos" 
     */ 

     static class Retorne_Maior {
        public static void main (String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite 3 números inteiros: ");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            int numero3 = sc.nextInt();

            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior número é " + numero1);
            } if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior número é " + numero2);
            } else {
                System.out.println("O maior número é " + numero3);
            }
            sc.close();

        }
     }

     /* Método
      ● Math.ceil(<valor>) 
        ○ Tem como função arredondar um valor (float ou double) para o próximo inteiro.
            1.8 -> 2
            2.7 -> 3
            4.1 -> 5
      ● Math.floor(<valor>) 
        ○ Também arredonda um valor (float ou double), porém inteiro anterior.
            1.8 -> 1
            2.7 -> 2
            4.1 -> 4
      ● Math.round(<valor>) 
        ○ Recebe um valor numérico e retorna esse valor arredondado.
            1.8 -> 2
            2.4 -> 2
      ● Math.max(<valor1>,<valor2>) 
        ○ Recebe dois valores numéricos e retorna o maior deles.
            3,9 -> 9
      ● Math.min(<valor1>,<valor2>) 
        ○ Recebe dois valores numéricos e retorna o menor deles.
            3,9 -> 3
      ● Math.sqrt(<valor>) 
        ○ Recebe um valor numérico e retorna sua raiz quadrada.
            25 -> 5
      ● Math.pow(<valor1>,<valor2>) 
        ○ Recebe dois valores numéricos (o operando e o expoente) e eleva o primeiro valor ao segundo.
            10,2 -> 100
      ● Math.abs(<valor>) 
        ○ Recebe um valor numérico e retorna seu valor absoluto, desconsiderando o sinal.
            -5 -> 5
    */

    // Método Random: É utilizado para gerar valores de forma aleatória.
        /* Exemplo:
           (int) (Math.random()*100); //Geraria números de 0 a 99.
         */ 

    // Formatação com a classe
    /* DecimalFormat
        ● Auxilia a formatação de cálculos com muitas casas decimais dando um visão mais 
        agradável dos números na tela.
        ● É necessário definir um modelo de formatação, conhecido pelo nome pattern.
        ● Para definir o pattern são usados caracteres especiais */

        /* Caractere e Significado:
            0 Imprime o dígito normalmente, ou, caso ele não exista, coloca 0 em seu lugar.
                Ex.: sejam as variáveis int x = 4, y=32, z=154, ao usar o pattern “000”, o
                     resultado impresso na tela seria x = 004, y = 032 e z=154.
        # Imprime o dígito normalmente, desprezando os zeros à esquerda do número.
                Ex.: sejam as variáveis double x=0.4 e y=01.34, ao usar o pattern “###”, o
                     resultado impresso na tela seria x = .4 e Y=1.34
        . Separador decimal ou separador decimal monetário (depende do sistema usado.
        - Sinal de número negativo.*/
    

    /* Exemplo do uso da classe DecimalFormat
       para formatação de números */
        static class FormatacaoDeNumeros {
        public static void main(String[] args) {
            DecimalFormat df = new DecimalFormat();

            short idade = 38;
            df.applyPattern ("000");
            System.out.println(df.format (idade));

            int quantidade = 9750;
            df.applyPattern ("#0,000");
            System.out.println(df.format (quantidade));

            long estoque = 198564;
            df.applyPattern("%, %#0,000");
            System.out.println(df.format (estoque));

            String valorReais = "2583.75";
            df.applyPattern("R$ #,##0.00");
            System.out.println(df.format (Double.parseDouble(valorReais)));
        }
    }

   /* String
    ● Uma variável do tipo String é uma instância da classe String – gera objetos que 
      possuem propriedades e métodos.
    ● As strings podem ser manipuladas de várias formas.
        ○ Verificar seu tamanho
        ○ Retirar uma substring
        ○ Mudar alguns caracteres

     <nome da string>.< nome do método>(<lista de argumentos>) 
     
     Método length
    ● Utilizado para retornar o tamanho de uma determinada String, incluindo também os 
      espaços em branco presentes nela.
     <nome da string>.length();

     Método trim():
    ● Retorna uma String sem os espaços em branco no começo e no final do texto.

     Método charAt
    ● Usado para retornar um caractere de determinada String de acordo com um índice especificado entre parênteses
     <nome da string>.charAt(<índice>);

     Funções interessantes da String
    ● toLowerCase(), toUpperCase() – transforma as letras de uma determinada string em 
      maiúscula ou minúscula.
    ● equalsIgnoreCase() – permite comparar valores desconsiderando ser maiúscula ou minúscula.
    ● substring(inicio), substring(inicio, fim) – retorna a cópia de uma string a partir de 
      índices inteiros especificados.
    ● replace(char, char), replace(string, string) – utilizado para substituição de caracteres.
    ● contains(CharSequence s) – avalia se a string original contém a string passada como 
      parâmetro, retorna um boolean.
    ● indexOf()– usado para localizar caracteres ou substrings em uma String.
    ● concat(String str) – retorna a junção da String na qual o método está sendo chamado 
      adicionando ao seu final a string passada por parâmetro (str).

    Método equals()
    ● É um método da classe Object utilizado para testar a relação de igualdade 
      entre dois objetos.
    Método equalsIgnoreCase()

    Funções interessantes da String estáticas:
    ● format(String s, …) – formata strings de forma semelhante ao printf.
    ● valueOf( ) - Converte qualquer valor (int, double,objeto etc..) em String.

    Considerações importantes
    ● A classe String em Java é imutável, o que significa que, uma vez criada, seu valor não 
      pode ser alterado. Se tentarmos modificar uma String, o Java cria um novo objeto na 
      memória ao invés de modificar o original.

      Em operações repetitivas (como em loops), o uso de String pode ser ineficiente, pois 
      cria vários objetos na memória.
     */

    // Exercício 1:
    // Exercício 2:
    // Exercício 3:
    // Exercício 4:
    // Exercício 5:
    
}
