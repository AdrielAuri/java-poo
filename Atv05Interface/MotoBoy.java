package Atv05Interface;

import java.time.LocalDate;

public class MotoBoy extends Funcionario {

    private String placaDaMoto;

    public MotoBoy(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento,
            LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
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

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
}
