package programming.university.javabelarmino.activities.poo.ps5.ps5_1;

public abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public abstract String obterTipo();
}