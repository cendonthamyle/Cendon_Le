package programming.university.javabelarmino.revision;

import java.util.Scanner;

public class VerificarSenha {

    // Método estático que verifica a senha recebida por parâmetro
    public static boolean verificarSenha(String senha) {
        // equalsIgnoreCase compara os textos ignorando a diferença entre maiúsculas e minúsculas
        return senha.equalsIgnoreCase("Java123");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senhaUsuario = scanner.next();

        // Chama o método estático e avalia o retorno booleano (true/false)
        if (verificarSenha(senhaUsuario)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Senha incorreta");
        }

        scanner.close();
    }
}