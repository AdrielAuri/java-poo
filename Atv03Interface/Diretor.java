package Atv03Interface;

// Estendendo a classe modelo Funcionario e implementando a interface Contratação
public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;
 
     public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
         super(nome, dataNascimento, sexo, setor, salarioBase);
     }
 
     public double getPREMIO() {
         return PREMIO;
     }
 
     @Override
     public double getSalarioFinal() {
         return super.getSalarioBase() + (super.getSalarioBase() * PREMIO);
     }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo " + funcionario.toString());
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", setor=" + setor
                + ", PREMIO=" + PREMIO + ", salarioBase=" + salarioBase + "]";
    }

    
 }
