

public class Armazenamento extends Geracao{

    private int capacidadeArmazenamento;
    private String tipoDeConexao;

    public Armazenamento(String nome, String modelo, int capacidadeArmazenamento, String tipoDeConexao) {
        super(nome, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "Armazenamento [nome= " + nome + ", capacidadeArmazenamento= " + capacidadeArmazenamento + ", modelo= "
                + modelo + ", tipoDeConexao= " + tipoDeConexao + "]";
    }
    
}
