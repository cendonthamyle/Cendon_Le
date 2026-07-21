package programming.university.javabelarmino.activities.poo.ps5.ps5_1;

public class Artigo extends Publicacao {

    public Artigo(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterTipo() {
        return "Artigo acadêmico";
    }
}