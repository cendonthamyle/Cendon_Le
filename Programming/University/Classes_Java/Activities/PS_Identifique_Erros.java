package Programming.University.Classes_Java.Activities;

public class PS_Identifique_Erros {
    //Identifique os erros:
       /* Descreva as linhas onde o erro ocorre, o tipo de erro ou
          o porquê ocorreu: Léxico, Sintático ou Semântico */ 

    /*
    // Código 1:
    public class Exemplo {
        public static void main(String[] args) {
            int valor = 10;
            double divisao = 20 ÷ 4;    // erro léxico: uso de símbolo inválido
            int @numero = 5;            // erro léxico: declaração de variável errônea, não é permitido iniciar com símbolos.

            System.out.println(numero * 2);
        }
        public voiid imprimir() { // erro léxico: palavra-chave digitada incorretamente
            System.out.println("Correto!");
        }
    } */

    // Código 2:
         public class CalculadoraSimples {
            public static void main(String[] args) {
                int num1 = 10;
               int num2 = 5;
               int s = num1 + num2;
     
              /* erro semântico: não tem sentido essa comparação pois dentro da estrutura 
                 if deve acontecer uma comparação que retorna um valor booleano. Nesse caso,
                 não está sendo feita uma comparação, mas uma atribuição de valor entre num1 e num2*/ 
               if(num1 = num2) System.out.println("iguais"); 
                   System.out.println("A soma de num1 e num2 é: " + s);
     
               int p = num1 * num2;
               System.out.println("O produto de num1 e num2 é: " + p) // erro sintático: esqueceu de finalizar com vírgula
               int d = num1 - num2;
               System.out.println("A diferença entre num1 e num2 é: " + d);
               int q = num1 / num2;
               System.out.println("O quociente de num1 e num2 é: " q); // erro sintático: faltou o operador de concatenação
            }
        }
    

    // Código 3:
    public class CallMethod {
        int var = -1;

        void sumVar(int var){
            return var++; // erro semântico: método void não retorna valor
        }

        public static void main(String[] args) {
            // erro semântico: 
            // incompatibilidade do método e do tipo, sendo um estático e o outro não-estático
            static var = 1000;
            sumVar(var); 
        }
    }
}
