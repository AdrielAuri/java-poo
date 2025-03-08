package Atv03Interface;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario diretor = new Diretor("Adriel", "10/02/1998", Sexo.MASCULINO, Setor.FINANCEIRO, 1500);
        Funcionario motoboy = new Motoboy("Juca", "02/05/2005", Sexo.MASCULINO, Setor.OPERACOES, 900, "B");
        
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());
        
        diretor.admitir(motoboy);
        
    }

}
