package programming.university.javabelarmino.activities.poo.ps5.ps5_3;

public abstract class AtivoFinanceiro {

    private String nome;
    private double valorInvestido;

    public AtivoFinanceiro(String nome, double valorInvestido) {
        setNome(nome);
        setValorInvestido(valorInvestido);
    }

    public abstract double calcularRetorno(int meses);

    public abstract boolean podeResgatar(double valor, int meses);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do ativo não pode estar vazio."
            );
        }

        this.nome = nome;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        if (valorInvestido <= 0) {
            throw new IllegalArgumentException(
                    "O valor investido deve ser maior que zero."
            );
        }

        this.valorInvestido = valorInvestido;
    }

    protected void validarMeses(int meses) {
        if (meses < 0) {
            throw new IllegalArgumentException(
                    "A quantidade de meses não pode ser negativa."
            );
        }
    }

    protected void validarValorResgate(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do resgate deve ser maior que zero."
            );
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s - Valor investido: R$ %.2f",
                nome,
                valorInvestido
        );
    }
}