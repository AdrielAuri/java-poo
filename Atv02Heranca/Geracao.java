

public abstract class Geracao {

    protected String nome;
    protected String modelo;
    
    public Geracao(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Geracao [nome= " + nome + ", modelo= " + modelo + "]";
    }
    
}
