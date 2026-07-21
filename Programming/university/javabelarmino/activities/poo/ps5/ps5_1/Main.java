package programming.university.javabelarmino.activities.poo.ps5.ps5_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacao> publicacoes = new ArrayList<>();

        publicacoes.add(
            new Livro("Dom Casmurro", "Machado de Assis", 1899)
        );

        publicacoes.add(
            new Revista("National Geographic", "Vários autores", 2024)
        );

        publicacoes.add(
            new Artigo(
                "Inteligência Artificial na Educação",
                "Ana Silva",
                2023
            )
        );

        for (Publicacao publicacao : publicacoes) {
            System.out.println("Título: " + publicacao.getTitulo());
            System.out.println("Autor: " + publicacao.getAutor());
            System.out.println("Ano: " + publicacao.getAnoPublicacao());
            System.out.println("Tipo: " + publicacao.obterTipo());
        }
    }
}