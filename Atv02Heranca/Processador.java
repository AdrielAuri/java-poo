

public class Processador extends Geracao {

    private String frequencia;

    public Processador(String nome, String modelo, String frequencia) {
        super(nome, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [nome= " + nome + ", frequencia= " + frequencia + ", modelo= " + modelo + "]";
    }

    
    
}
