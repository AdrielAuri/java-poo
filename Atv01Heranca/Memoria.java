package Atv01Heranca;

public class Memoria extends Hardware{

    private int capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, int capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", modelo="
                + modelo + "]";
    }

}
