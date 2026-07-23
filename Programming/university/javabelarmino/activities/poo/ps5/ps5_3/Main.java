package programming.university.javabelarmino.activities.poo.ps5.ps5_3;

public class Main {

    public static void main(String[] args) {
        CarteiraInvestimentos carteira = new CarteiraInvestimentos();

        try {
            carteira.adicionarAtivo(
                    new Acao("Ações da Empresa X", 5_000.00)
            );

            carteira.adicionarAtivo(
                    new TesouroDireto("Tesouro Selic", 8_000.00)
            );

            carteira.adicionarAtivo(
                    new CDB("CDB Banco Y", 10_000.00)
            );
        } catch (IllegalArgumentException | IllegalStateException erro) {
            System.out.println(
                    "Erro ao adicionar ativo: " + erro.getMessage()
            );
        }

        int periodo = 12;

        carteira.exibirAtivos(periodo);

        System.out.printf(
                "%nValor total da carteira após %d meses: R$ %.2f%n",
                periodo,
                carteira.calcularValorTotal(periodo)
        );

        System.out.println("\n--- Testes de resgate ---");

        // Cenário 1: ação antes do prazo mínimo.
        tentarResgate(
                carteira,
                "Ações da Empresa X",
                1_000.00,
                4
        );

        // Cenário 2: ação depois do prazo mínimo.
        tentarResgate(
                carteira,
                "Ações da Empresa X",
                2_000.00,
                12
        );

        // Cenário 3: Tesouro Direto.
        tentarResgate(
                carteira,
                "Tesouro Selic",
                5_000.00,
                2
        );

        // Cenário 4: CDB acima do limite de 50%.
        tentarResgate(
                carteira,
                "CDB Banco Y",
                7_000.00,
                12
        );

        // Cenário 5: CDB abaixo do limite de 50%.
        tentarResgate(
                carteira,
                "CDB Banco Y",
                3_000.00,
                12
        );

        // Cenário 6: ativo inexistente.
        tentarResgate(
                carteira,
                "Fundo Imobiliário",
                500.00,
                12
        );

        System.out.println("\n--- Situação final da carteira ---");
        carteira.exibirAtivos(12);

        System.out.printf(
                "Valor total restante: R$ %.2f%n",
                carteira.calcularValorTotal(12)
        );
    }

    private static void tentarResgate(
            CarteiraInvestimentos carteira,
            String nomeAtivo,
            double valor,
            int meses
    ) {
        try {
            System.out.printf(
                    "%nTentando resgatar R$ %.2f de \"%s\" após %d meses...%n",
                    valor,
                    nomeAtivo,
                    meses
            );

            carteira.resgatar(nomeAtivo, valor, meses);
        } catch (IllegalArgumentException | IllegalStateException erro) {
            System.out.println(
                    "Não foi possível realizar o resgate: "
                            + erro.getMessage()
            );
        }
    }
}