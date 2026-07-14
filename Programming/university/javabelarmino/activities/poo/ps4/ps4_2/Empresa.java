package programming.university.javabelarmino.activities.poo.ps4.ps4_2;

public class Empresa {
    private Empregado[] empregados = new Empregado[100];
    private int totalEmpregados = 0;

    public void cadastrarEmpregado(int id, String nome, double salario) {
        if (totalEmpregados >= 100) {
            System.out.println("Erro: Limite máximo de 100 empregados atingido.");
            return;
        }
        
        for (int i = 0; i < totalEmpregados; i++) {
            if (empregados[i].getId() == id) {
                System.out.println("Erro: Já existe um empregado cadastrado com o ID " + id);
                return;
            }
        }

        empregados[totalEmpregados] = new Empregado(id, nome, salario);
        totalEmpregados++;
        System.out.println("Empregado cadastrado com sucesso!");
    }

    public void aplicarAumento(int id, double percentual) {
        for (int i = 0; i < totalEmpregados; i++) {
            if (empregados[i].getId() == id) {
                empregados[i].aumentaSalario(percentual);
                System.out.println("Aumento aplicado com sucesso para " + empregados[i].getNome());
                return;
            }
        }
        System.out.println("Erro: Empregado com ID " + id + " não encontrado.");
    }

    public boolean demitirEmpregado(int id) {
        for (int i = 0; i < totalEmpregados; i++) {
            if (empregados[i].getId() == id) {
                for (int j = i; j < totalEmpregados - 1; j++) {
                    empregados[j] = empregados[j + 1];
                }
                empregados[totalEmpregados - 1] = null; 
                totalEmpregados--;
                return true;
            }
        }
        return false;
    }

    public void listarEmpregados() {
        if (totalEmpregados == 0) {
            System.out.println("Nenhum empregado cadastrado no momento.");
            return;
        }
        System.out.println("\n||  LISTA DE EMPREGADOS  ||");
        for (int i = 0; i < totalEmpregados; i++) {
            empregados[i].exibirInfo();
        }
    }
}