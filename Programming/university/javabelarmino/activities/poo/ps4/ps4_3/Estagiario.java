package programming.university.javabelarmino.activities.poo.ps4.ps4_3;

public class Estagiario extends Empregado {
    private static final double AUXILIO_ALIMENTACAO = 500.0;

    public Estagiario(int id, String nome, double salarioBruto) {
        super(id, nome, salarioBruto);
    }

    @Override
    public double calculaSalarioLiquido() {
        return super.calculaSalarioLiquido() + AUXILIO_ALIMENTACAO;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Cargo: Estagiário | ID: %d | Nome: %s | Salário Líquido (com auxílio): R$ %.2f%n", 
                getId(), getNome(), calculaSalarioLiquido());
    }
}