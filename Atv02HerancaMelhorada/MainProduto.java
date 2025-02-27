package Atv02HerancaMelhorada;

public class MainProduto {
    public static void main(String[] args) {

        Processador processador1 = new Processador("Ryzen", "1600", 2.5);
        Memoria memoria1 = new Memoria("Hyperx", "450", 2440, 2);
        PlacaMae placaMae1 = new PlacaMae("Gigabyte", "b450", "am4");
        Armazenamento armazenamento1 = new Armazenamento("hunter", 150, "5145", "sata");
        
        System.out.println();
        System.out.println(processador1);
        System.out.println();
        System.out.println(memoria1);
        System.out.println();
        System.out.println(placaMae1);
        System.out.println();
        System.out.println(armazenamento1);
        System.out.println();
    }

}
