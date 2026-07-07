package programming.university.javabelarmino.activities.poo.usuario;


public class Usuario {
    private String nome;
    private String sobrenome;
    private int idade;

    boolean maiorDeIdade;

    public Usuario (String nome, String sobrenome, int idade, boolean maiorDeIdade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.maiorDeIdade = maiorDeIdade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getIdade(){
        return this.idade;
    }

    public boolean getMaiorDeIdade(int idade) {
        return this.idade >= 18;
    }

    public void printUsuario() {
        System.out.println("Usuário{ Nome: " + nome + "Sobrenome: " + sobrenome + "Idade: " + idade);
    }

    @Override
    public String toString() {
        return "Usuário{ Nome: " + nome + "Sobrenome: " + sobrenome + "Idade: " + idade + "}";
    }

}