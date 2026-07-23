package programming.university.javabelarmino.activities.poo.ps5.ps5_3;

public class CDB extends AtivoFinanceiro {

    private static final double TAXA_MENSAL = 0.04;

    public CDB(String nome, double valorInvestido) {
        super(nome, valorInvestido);
    }

    @Override
    public double calcularRetorno(int meses) {
        validarMeses(meses);

        return getValorInvestido()
                * Math.pow(1 + TAXA_MENSAL, meses);
    }

    @Override
    public boolean podeResgatar(double valor, int meses) {
        validarMeses(meses);
        validarValorResgate(valor);

        double saldoTotal = calcularRetorno(meses);
        double limiteResgate = saldoTotal * 0.50;

        return valor < limiteResgate;
    }
}