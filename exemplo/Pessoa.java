package exemplo;

// as classes abstratas não podem ser instanciadas no main
// abstract é usado para uma classe servir de modelo para outra classe
// necessários atributos protected e abstract para classes herança
public abstract class Pessoa {

    // protected quer dizer que somente as classes que estendem de pessoa podem usar atributos/ver
    // somente classes estendidas podem usar os atributos 
    protected String nome;
    protected int idade;
    
    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

}
