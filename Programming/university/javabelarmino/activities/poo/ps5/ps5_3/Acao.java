package programming.university.javabelarmino.activities.poo.ps5.ps5_3;

public class Acao extends AtivoFinanceiro {

    private static final double TAXA_MENSAL = 0.08;
    private static final int PRAZO_MINIMO_RESGATE = 6;

    public Acao(String nome, double valorInvestido) {
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

        double saldo = calcularRetorno(meses);

        return meses >= PRAZO_MINIMO_RESGATE && valor <= saldo;
    }
}