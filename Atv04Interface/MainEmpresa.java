package Atv04Interface;

public class MainEmpresa {
    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("Carlos", "12345678900", "10/05/1995", 2000.0, "ABC-1234");
        Gerente gerente = new Gerente("Ana", "98765432100", "25/07/1987", 5000.0);

        System.out.println(motoboy);
        System.out.println("Salário final Motoboy: " + motoboy.obterSalarioFinal());
        System.out.println(gerente);
        System.out.println("Salário final Gerente: " + gerente.obterSalarioFinal());

        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }

}
