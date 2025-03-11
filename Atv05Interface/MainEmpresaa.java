package Atv05Interface;

import java.time.LocalDate;

public class MainEmpresaa {
    public static void main(String[] args) {
        MotoBoy motoboy = new MotoBoy("Adriel", "051.157.781-05", "55454545454", Genero.MASCULINO, 1500, LocalDate.of(1998, 02, 10), LocalDate.of(2020, 02, 10),"RPB1D29");
        Gerente gerente = new Gerente("Juca", "054.784.154-78", "484.784.052-02", Genero.MASCULINO, 3000, LocalDate.of(1950, 02, 15), LocalDate.of(2025, 11, 25));
        Diretor diretor = new Diretor("Jacinta", "154.784.051-05", "487.154.840-09", Genero.FEMININO, 4500, LocalDate.of(1948, 07, 29), LocalDate.of(2017, 05, 18));

        System.out.println();
        diretor.admitir(motoboy);
        System.out.println();
        diretor.demitir(motoboy);
        System.out.println();

        System.out.println(motoboy);
        System.out.println("Salario final do Motoboy: " + motoboy.getSalarioFinal());
        System.out.println();

        System.out.println(gerente);
        System.out.println("Salário final do Gerente: " + gerente.getSalarioFinal());
        System.out.println();

        System.out.println(diretor);
        System.out.println("Salário final do Diretor: " + diretor.getSalarioFinal());


    }

}
