package Atv05Interface;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {

    private final double PREMIO = 1.1;

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionário contratado: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionário demitido: " + funcionario.toString());
    }

    @Override
    public double getSalarioFinal(){
        return salarioBase * (PREMIO + bonificacao.getValorBonificacao());
    }

    public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento,
            LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public String toString(){
        return "Cargo: Diretor" + super.toString();
    }




}
