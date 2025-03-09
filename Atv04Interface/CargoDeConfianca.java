package Atv04Interface;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase,
            Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    @Override
    public double obterSalarioFinal() {
        return getSalarioBase() * bonificacao.getValorBonificacao(); 
    }

}
