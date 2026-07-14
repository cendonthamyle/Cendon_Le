package programming.university.javabelarmino.activities.poo.ps4.ps4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Criando uma lista polimórfica de Empregados
        List<Empregado> equipe = new ArrayList<>();

        equipe.add(new Gerente(101, "Alice Souza", 8000.0));
        equipe.add(new Operador(102, "Bruno Costa", 2500.0));
        equipe.add(new Estagiario(103, "Carla Dias", 1500.0));

        System.out.println("|| EXIBINDO INFORMAÇÕES INICIAIS ||");
        for (Empregado emp : equipe) {
            emp.exibirInfo();
        }

        System.out.println("\n|| APLICANDO AUMENTO DE 10% A TODOS ||");
        for (Empregado emp : equipe) {
            emp.aumentaSalario(10.0);
        }

        System.out.println("\n|| INFORMAÇÕES APÓS AUMENTO ||");
        for (Empregado emp : equipe) {
            emp.exibirInfo();
        }
    }
}