package Atv04Interface;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionário contratado: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionário demitido: " + funcionario.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " (Cargo: Gerente)";
    }

}
