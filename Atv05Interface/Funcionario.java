package Atv05Interface;
import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{

    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento,
            LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        
    }

    // Método para pegar a idade com base na data de nascimento fornecida
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", genero=" + genero + ", salarioBase="
                + salarioBase + ", dataNascimento=" + dataNascimento + ", dataAdmissao=" + dataAdmissao
                + ", Idade =" + getIdade() + " Anos]";
    }

    

}
