package programming.university.javabelarmino.activities.poo.ps5.ps5_2;

public abstract class ContaBancaria implements Operacoes {
    private int id;
    private String titular;
    protected double saldo;

    public ContaBancaria(int id, String titular, double saldoInicial) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return;
        }

        saldo += valor;
        System.out.printf(
            "Depósito de R$ %.2f realizado na conta de %s.%n",
            valor,
            titular
        );
    }

    @Override
    public abstract void sacar(double valor);

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}