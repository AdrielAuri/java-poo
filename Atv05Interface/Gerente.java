package Atv05Interface;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

        public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento,
                    LocalDate dataAdmissao) {
                super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
                
            }
        
                @Override
    public String toString() {
        return "Cargo: Gerente" + super.toString();
    }

    @Override
    public double getSalarioFinal(){
        return super.salarioBase * bonificacao.getValorBonificacao();
    }

    

    





}
