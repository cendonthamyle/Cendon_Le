package programming.university.javabelarmino.activities.poo.ps4.ps4_3;

public class Operador extends Empregado {
    private static final double AUXILIO_ALIMENTACAO = 500.0;
    private static final double AUXILIO_TRANSPORTE = 500.0;

    public Operador(int id, String nome, double salarioBruto) {
        super(id, nome, salarioBruto);
    }

    @Override
    public double calculaSalarioLiquido() {
        return super.calculaSalarioLiquido() + AUXILIO_ALIMENTACAO + AUXILIO_TRANSPORTE;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Cargo: Operador | ID: %d | Nome: %s | Salário Líquido (com auxílios): R$ %.2f%n", 
                getId(), getNome(), calculaSalarioLiquido());
    }
}