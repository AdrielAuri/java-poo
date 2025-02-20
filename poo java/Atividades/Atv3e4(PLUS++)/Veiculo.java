package Atividades.Atv3e4;

public class Veiculo {
    
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private double capacidadeTanque;
    private double velocidadeMaxima;
    private double consumoMedio;

    void exibirVeiculos (){
        
        System.out.println("\nPlaca: " + placa );
        System.out.println("Cor: " + cor);
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Capacidade do tanque: " + capacidadeTanque);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Consumo médio: " + consumoMedio);
    }

    public Veiculo(String placa, String cor, int numeroPassageiros, double capacidadeTanque, double velocidadeMaxima,
            double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    
    
}
