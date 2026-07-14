package programming.university.javabelarmino.activities.poo.ps4.ps4_3;

public class Gerente extends Empregado {
    private static final double BONIFICACAO = 3000.0;

    public Gerente(int id, String nome, double salarioBruto) {
        super(id, nome, salarioBruto);
    }

    @Override
    public double calculaSalarioLiquido() {
        // Salário líquido base + bonificação de R$ 3000
        return super.calculaSalarioLiquido() + BONIFICACAO;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Cargo: Gerente | ID: %d | Nome: %s | Salário Líquido (com bônus): R$ %.2f%n", 
                getId(), getNome(), calculaSalarioLiquido());
    }
}