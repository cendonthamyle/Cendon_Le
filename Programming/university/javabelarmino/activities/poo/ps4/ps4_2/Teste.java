package programming.university.javabelarmino.activities.poo.ps4.ps4_2;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcao;

        do {
            System.out.println("\n===== MENU DE GERENCIAMENTO =====");
            System.out.println("1 - Cadastrar Empregado");
            System.out.println("2 - Aplicar Aumento Salarial");
            System.out.println("3 - Demitir Empregado");
            System.out.println("4 - Listar Empregados");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do empregado: ");
                    int idCad = sc.nextInt();
                    sc.nextLine(); // Limpar buffer do teclado
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o salário bruto: ");
                    double salario = sc.nextDouble();
                    
                    empresa.cadastrarEmpregado(idCad, nome, salario);
                    break;

                case 2:
                    System.out.print("Digite o ID do empregado: ");
                    int idAum = sc.nextInt();
                    System.out.print("Digite a porcentagem de aumento: ");
                    double percentual = sc.nextDouble();
                    
                    empresa.aplicarAumento(idAum, percentual);
                    break;

                case 3:
                    System.out.print("Digite o ID do empregado a ser demitido: ");
                    int idDem = sc.nextInt();
                    boolean sucesso = empresa.demitirEmpregado(idDem);
                    
                    if (sucesso) {
                        System.out.println("Empregado demitido com sucesso.");
                    } else {
                        System.out.println("Erro: ID não encontrado.");
                    }
                    break;

                case 4:
                    empresa.listarEmpregados();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }
}