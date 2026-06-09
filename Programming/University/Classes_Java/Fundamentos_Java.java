package Programming.University.Classes_Java;


public class Fundamentos_Java {
    /* public class = public class é um modificador de acesso que torna a classe acessível de qualquer outro lugar do código. 
     * Isso significa que outras classes podem criar instâncias dessa classe ou acessar seus membros públicos. 
     */

     /* Fundamentos_Java = é o nome da classe. 
      * Em Java, as classes são usadas para definir objetos e suas características. 
      * O nome da classe deve seguir as convenções de nomenclatura, começando com letra maiúscula.
      */
    public static void main(String[] args) {

        /* public = é um modificador de acesso que torna o método acessível de qualquer outro lugar do código. 
         * Isso significa que outras classes podem chamar esse método.
         */
        /* static = é um modificador que indica que o método pertence à classe, e não a uma instância específica da classe. 
         * Isso permite que o método seja chamado sem criar um objeto da classe.
         */
        /* void = é o tipo de retorno do método, indicando que ele não retorna nenhum valor.
         */
        /* main = é o nome do método principal em Java. É o ponto de entrada para a execução do programa. 
         * Quando você executa um programa Java, a JVM procura por esse método para iniciar
         */

        System.out.println("Bom dia!"); 
        /* System.out.println é um método que imprime uma mensagem no console. "Bom dia!" é a mensagem que será exibida. 
         * O método println adiciona uma nova linha após a mensagem, para que a próxima saída seja exibida em uma nova linha.
         */
    }

    /* Os dados são armazenados em variáveis, que são como caixas onde podemos guardar informações. 
     * Em Java, precisamos declarar o tipo de dado que a variável irá armazenar, 
     * como int para números inteiros, double para números decimais, String para texto, entre outros.
     */

    //Exemplo de declaração de variáveis:
    int idade = 25; //variável do tipo inteiro que armazena a idade
    double altura = 1.75; //variável do tipo double que armazena a altura
    String nome = "João"; //variável do tipo String que armazena o nome

    //toda variável tem <tipo> <nome> = <valor>;
    //tipos de dados: 
        // primitivos (int, double, boolean, char) 
            /* char é um tipo de dado primitivo que representa um único caractere, como 'a', '1' ou '@'. 
             * Ele é declarado usando aspas simples e ocupa 2 bytes de memória. 
             * O char é usado para armazenar caracteres individuais em Java.
             */

            /*Uso do padrão Unicode para representar caracteres, 
             * o que permite a representação de uma ampla variedade de caracteres de diferentes idiomas e símbolos.
             * conjunto de caracteres de 16 bits, o que significa que pode representar até 65.536 caracteres diferentes.
             */
        // não primitivos ou referenciados (String, Arrays, Classes)

    //Forma certa de declarar variáveis:
        float distancia = 10.5f; 
            /* variável do tipo float que armazena a distância. 
             * O sufixo 'f' é necessário para indicar que o valor é do tipo float, 
             * caso contrário, ele seria tratado como um double por padrão.
             */
        long populacao = 7800000000L; 
            /* variável do tipo long que armazena a população mundial. 
             * O sufixo 'L' é necessário para indicar que o valor é do tipo long, 
             * caso contrário, ele seria tratado como um int por padrão.
             */
    
    /* variável final: é uma variável que não pode ser alterada após ser inicializada. 
     * Ela é usada para armazenar valores constantes que não devem ser modificados durante a execução do programa. 
     * Para declarar uma variável final, usamos a palavra-chave "final" antes do tipo da variável. Por exemplo:
     */
        final double PI = 3.14159;
            //variável final que armazena o valor de pi. 
            // O valor de pi é uma constante matemática e não deve ser alterado, por isso é declarado como final.
        /* padronização de nomes para variáveis finais: 
         * é comum usar letras maiúsculas e underscores para separar as palavras, como PI, MAX_VALUE, etc. 
         * Isso ajuda a identificar facilmente que a variável é uma constante.
         */

    // Operadores aritméticos: são usados para realizar operações matemáticas em Java.
     /* + (adição), - (subtração), * (multiplicação), / (divisão) e % (módulo).
         * O operador de adição (+) é usado para somar dois números ou concatenar strings.

         * O operador de subtração (-) é usado para subtrair um número de outro.

         * O operador de multiplicação (*) é usado para multiplicar dois números.

         * O operador de divisão (/) é usado para dividir um número por outro. 
            * Se ambos os operandos forem inteiros, o resultado será um inteiro (divisão inteira). 
            * Se pelo menos um dos operandos for um número decimal, o resultado será um número decimal (divisão real).
         * O operador de módulo (%) retorna o restante da divisão entre dois números.
         * 
            * O operador de módulo é útil para verificar se um número é par ou ímpar,
            * ou para obter o dígito mais à direita de um número, entre outras aplicações.
      */

    //Precedência de operadores:
        /* A precedência de operadores determina a ordem em que as operações são avaliadas em uma expressão. 
        * Em Java, os operadores têm diferentes níveis de precedência, e as expressões são avaliadas da esquerda para a direita. 
        * Por exemplo, na expressão 3 + 4 * 2, a multiplicação (*) tem maior precedência do que a adição (+), 
        * então a expressão é avaliada como 3 + (4 * 2), resultando em 11.
        */
    
        /* Para alterar a ordem de avaliação, podemos usar parênteses. 
        * Por exemplo, na expressão (3 + 4) * 2, os parênteses indicam que a adição deve ser avaliada primeiro, 
        * resultando em (7) * 2, o que dá 14.
        */

        /* Precedência geral:
         * 1. Parênteses ()
         * 2. Operadores unários (++, --)
         * 3. Operadores de multiplicação e divisão (*, /, %)
         * 4. Operadores de adição e subtração (+, -)
         */
        
            /* idade++ e ++idade são operadores de incremento em Java, 
             * usados para aumentar o valor de uma variável em 1.
                * A diferença entre eles é a ordem de avaliação:
                    * idade++ (pós-incremento): o valor da variável é usado primeiro e depois incrementado. 
                        * Por exemplo, se idade for 25, a expressão idade++ retornará 25 e depois aumentará idade para 26.
                    * ++idade (pré-incremento): a variável é incrementada primeiro e depois seu valor é usado. 
                        * Por exemplo, se idade for 25, a expressão ++idade aumentará idade para 26 e depois retornará 26.
             * Ambos os operadores são úteis em diferentes contextos, 
             * dependendo de quando você deseja que o valor seja incrementado em relação à sua utilização na expressão.
             */


        /* Precedência relacional: 
            * 1. Parênteses ()
            * 2. Operadores de comparação (>, <, >=, <=)
            * 3. Operadores de igualdade (==, !=)
            * 4. Operadores lógicos (&&, ||) 
                * Operadores lógicos: 
                    * && (AND lógico): retorna true se ambos os operandos forem verdadeiros, 
                    * caso contrário, retorna false.
                    * || (OR lógico): retorna true se pelo menos um dos operandos for verdadeiro, 
                    * caso contrário, retorna false.
        */

    /* Sequência de escape: 
        * \n (nova linha): move o cursor para a próxima linha.
        * \t (tabulação): adiciona um espaço horizontal equivalente a uma tabulação.
        * \\ (barra invertida): permite incluir uma barra invertida literal na string.
        * \" (aspas duplas): permite incluir aspas duplas literais na string.
        * \' (aspas simples): permite incluir aspas simples literais na string.
        * \r (retorno de carro): move o cursor para o início da linha atual.
        * \f (form feed): avança o cursor para a próxima página (pouco usado).
        * \b (backspace): move o cursor para trás, apagando o caractere anterior.
    
        * As sequências de escape são usadas para formatar a saída de texto e incluir caracteres especiais em strings.
     */

    /* Conversão de tipos: 
        * Em Java, podemos converter um tipo de dado para outro usando casting. 
        * Existem dois tipos de casting: 
            * Casting implícito: ocorre quando o Java converte automaticamente um tipo de dado para outro, 
                * geralmente quando o tipo de destino é maior ou mais abrangente do que o tipo original. 
                * Por exemplo, converter um int para um double é um casting implícito, 
                * pois o double pode armazenar valores maiores e decimais.
            * Casting explícito: ocorre quando o programador força a conversão de um tipo de dado para outro, 
                * mesmo que haja risco de perda de informação ou erro. 
                * Para fazer um casting explícito, usamos parênteses com o tipo de destino antes do valor a ser convertido. 
                * Por exemplo, converter um double para um int requer um casting explícito, como (int) 3.14, resultando em 3.
     */

    /* Conversão de Expressões: 
        * Em Java, as expressões podem ser convertidas para um tipo de dado específico usando casting. 
        * Isso é útil quando queremos garantir que o resultado de uma expressão seja de um tipo específico, 
        * ou quando queremos evitar erros de tipo. 
           * byte, short and char são convertidos para int antes de serem usados em expressões.
           * caso o operando seja long, float ou double, a expressão inteira é convertida para o tipo do operando.
     */

    /* Tipos System:
        * System.out: é um objeto que representa a saída padrão do console. 
            * Ele é usado para imprimir mensagens e resultados no console usando métodos como println(), printf() e print().
               * println() imprime a mensagem seguida de uma nova linha,
               * print() imprime a mensagem sem adicionar uma nova linha.
               * printf() permite formatar a saída de acordo com especificadores de formato,
                    * %d para inteiros, 
                    * %f para números decimais, 
                    * %s para strings,
                    * %n para nova linha.
               
        * System.in: é um objeto que representa a entrada padrão do console. 
            * Ele é usado para ler dados do usuário, 
            * geralmente usando a classe Scanner para facilitar a leitura de diferentes tipos de dados.
     */

    // Importação de classes: 
        /* Em Java, podemos importar classes de outros pacotes para usar suas funcionalidades em nosso código. 
         * A palavra-chave "import" é usada para isso. 
         */
            /* Import java.util.Locale: 
             * A classe Locale é usada para representar uma região geográfica, cultural ou política específica. 
             * Ela é útil para formatar números, datas e outros dados de acordo com as convenções locais. 
             * Por exemplo, em alguns países, o separador decimal é uma vírgula (,) em vez de um ponto (.), 
             * e a classe Locale pode ser usada para garantir que os números sejam formatados corretamente 
             * de acordo com essas convenções.
             */
            /* Import java.util.Scanner: 
             * A classe Scanner é usada para ler dados do usuário a partir da entrada padrão do console. 
             * Ela é útil para ler diferentes tipos de dados, como strings, números inteiros e números de ponto flutuante.
             */
            /* Import javax.swing.JOptionPane: 
             * A classe JOptionPane é usada para criar caixas de diálogo gráficas para interagir com o usuário. 
             * Ela é útil para exibir mensagens, solicitar entrada do usuário 
             * e criar interfaces gráficas simples sem a necessidade de criar uma janela completa usando Swing ou JavaFX.
             */
                /* JOptionPane.showInputDialog: 
                 * é um método da classe JOptionPane que exibe uma caixa de diálogo para solicitar entrada do usuário.
                 * Ele retorna a entrada do usuário como uma string.
                 */
                /* JOptionPane.showMessageDialog: 
                 * é um método da classe JOptionPane que exibe uma caixa de diálogo para mostrar uma mensagem ao usuário. 
                 * Ele é usado para fornecer feedback ou informações ao usuário de forma gráfica, 
                 * sem a necessidade de usar o console.
                 */  
}

