

public class Memoria extends Geracao{

    private double capacidadeDeArmazenamento;
    private String frequencia;
    
    public Memoria(String nome, String modelo, double capacidadeDeArmazenamento, String frequencia) {
        super(nome, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frequencia = frequencia;
    }

    public double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Memoria [nome= " + nome + ", capacidadeDeArmazenamento= " + capacidadeDeArmazenamento + ", modelo= "
                + modelo + ", frequencia= " + frequencia + "]";
    }

    
    
}
