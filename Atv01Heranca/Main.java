package Atv01Heranca;

public class Main {
    public static void main(String[] args) {
        
        Processador processador1 = new Processador("Dell", "Ryzen 5 1600", "75hz");
        Memoria memoria1 = new Memoria("HyperX", "2502", 16);

        System.out.println();
        System.out.println(processador1.toString());
        System.out.println();
        System.out.println(memoria1.toString());
        System.out.println();
    }

}
