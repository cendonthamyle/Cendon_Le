package programming.university.javabelarmino.activities.poo.ps4.ps4_1;

public class Empregado {
    private static int contadorIds = 1;

    private int id;
    private String nome;
    private double salarioBruto;
    private double imposto;

    // Construtor
    public Empregado(String nome, double salarioBruto, double imposto) {
        this.id = contadorIds++;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    // Métodos solicitados
    public double calculaSalarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    public void aumentaSalario(double percentual) {
        this.salarioBruto += this.salarioBruto * (percentual / 100.0);
    }

    public void exibirInfo() {
        System.out.printf("%s, R$ %.2f%n", this.nome, calculaSalarioLiquido());
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }
}