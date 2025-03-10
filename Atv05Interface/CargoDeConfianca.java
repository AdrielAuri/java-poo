package Atv05Interface;

import java.time.LocalDate;

public class CargoDeConfianca extends Funcionario {

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Genero genero, double salarioBase,
            LocalDate dataNascimento, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal(){
        return super.salarioBase * bonificacao.getValorBonificacao();
    }

}
