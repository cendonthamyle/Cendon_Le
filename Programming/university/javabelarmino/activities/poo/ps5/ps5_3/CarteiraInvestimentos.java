package programming.university.javabelarmino.activities.poo.ps5.ps5_3;

import java.util.ArrayList;
import java.util.List;

public class CarteiraInvestimentos {

    private static final int LIMITE_ATIVOS = 5;

    private final List<AtivoFinanceiro> ativos;

    public CarteiraInvestimentos() {
        ativos = new ArrayList<>();
    }

    public void adicionarAtivo(AtivoFinanceiro ativo) {
        if (ativo == null) {
            throw new IllegalArgumentException(
                    "O ativo não pode ser nulo."
            );
        }

        if (ativos.size() >= LIMITE_ATIVOS) {
            throw new IllegalStateException(
                    "A carteira já atingiu o limite de 5 ativos."
            );
        }

        if (buscarAtivo(ativo.getNome()) != null) {
            throw new IllegalArgumentException(
                    "Já existe um ativo com o nome: " + ativo.getNome()
            );
        }

        ativos.add(ativo);
    }

    public double calcularValorTotal(int meses) {
        if (meses < 0) {
            throw new IllegalArgumentException(
                    "A quantidade de meses não pode ser negativa."
            );
        }

        double valorTotal = 0;

        for (AtivoFinanceiro ativo : ativos) {
            valorTotal += ativo.calcularRetorno(meses);
        }

        return valorTotal;
    }

    public void resgatar(String nomeAtivo, double valor, int meses) {
        AtivoFinanceiro ativo = buscarAtivo(nomeAtivo);

        if (ativo == null) {
            throw new IllegalArgumentException(
                    "Ativo não encontrado: " + nomeAtivo
            );
        }

        if (!ativo.podeResgatar(valor, meses)) {
            throw new IllegalStateException(
                    obterMotivoFalha(ativo, valor, meses)
            );
        }

        ativos.remove(ativo);

        System.out.printf(
                "Resgate de R$ %.2f do ativo \"%s\" realizado com sucesso.%n",
                valor,
                ativo.getNome()
        );
    }

    private AtivoFinanceiro buscarAtivo(String nomeAtivo) {
        if (nomeAtivo == null) {
            return null;
        }

        for (AtivoFinanceiro ativo : ativos) {
            if (ativo.getNome().equalsIgnoreCase(nomeAtivo)) {
                return ativo;
            }
        }

        return null;
    }

    private String obterMotivoFalha(
            AtivoFinanceiro ativo,
            double valor,
            int meses
    ) {
        double saldo = ativo.calcularRetorno(meses);

        if (ativo instanceof Acao && meses < 6) {
            return "A ação só pode ser resgatada depois de 6 meses.";
        }

        if (ativo instanceof CDB && valor >= saldo * 0.50) {
            return String.format(
                    "O CDB permite resgatar um valor menor que 50%% "
                            + "do saldo. Limite atual: R$ %.2f.",
                    saldo * 0.50
            );
        }

        if (valor > saldo) {
            return String.format(
                    "Saldo insuficiente. Saldo atual: R$ %.2f.",
                    saldo
            );
        }

        return "O resgate não atende às regras do ativo.";
    }

    public void exibirAtivos(int meses) {
        if (ativos.isEmpty()) {
            System.out.println("A carteira está vazia.");
            return;
        }

        System.out.println("\nAtivos da carteira:");

        for (AtivoFinanceiro ativo : ativos) {
            System.out.printf(
                    "- %s | Investido: R$ %.2f | Saldo após %d meses: R$ %.2f%n",
                    ativo.getNome(),
                    ativo.getValorInvestido(),
                    meses,
                    ativo.calcularRetorno(meses)
            );
        }
    }

    public List<AtivoFinanceiro> getAtivos() {
        return new ArrayList<>(ativos);
    }
}