package Atv02HerancaMelhorada;

public abstract class Produto {
    
    protected String marca;
    protected String modelo;
    protected double frequencia ;
    protected double capacidadeDeArmazenamento;

    // Construtor usado para a classe processador
    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Construtor usado para a classe memória
    public Produto(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    // Construtor usado para a classe dispositivo de armazenamento
    // Cuidado com a ordem dos tipos de variáveis para não dar conflito na assinatura da classe
    public Produto(String marca, double capacidadeDeArmazenamento, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public Produto(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String toStringMarcaModelo() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + "]";
    }

    public String toStringMarcaModeloFrequencia() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
    }

    public String toStringMarcaModeloArmazenamento() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", capacidadeDeArmazenamento="
                + capacidadeDeArmazenamento + "]";
    }

    public String toStringTodos() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia
                + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }

    

    

    

    
}
