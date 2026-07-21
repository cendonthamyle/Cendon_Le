package programming.university.javabelarmino.activities.poo.ps5.ps5_1;

public class Revista extends Publicacao {

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterTipo() {
        return "Revista";
    }
}