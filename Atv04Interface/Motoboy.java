package Atv04Interface;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return super.getSalarioBase();
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Placa da Moto: " + placaDaMoto;
    }

    

}
