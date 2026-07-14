package programming.university.javabelarmino.activities.poo.ps4.ps4_3;

public abstract class Empregado {
    private int id;
    private String nome;
    protected double salarioBruto; 
    private double imposto;

    public Empregado(int id, String nome, double salarioBruto) {
        this.id = id;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = 0.0;
    }

    public int getId() { 
        return id; 
    }

    public void setId(int id) {
         this.id = id; 
        }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public double getSalarioBruto() { 
        return salarioBruto; 
    }

    public void setSalarioBruto(double salarioBruto) { 
        this.salarioBruto = salarioBruto; 
    }

    public double getImposto() { 
        return imposto; 
    }

    public void setImposto(double imposto) { 
        this.imposto = imposto; 
    }

    public void aumentaSalario(double percentual) {
        this.salarioBruto += this.salarioBruto * (percentual / 100.0);
    }

    public double calculaSalarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    // Método abstrato: cada subclasse é obrigada a implementar sua própria versão
    public abstract void exibirInfo();
}