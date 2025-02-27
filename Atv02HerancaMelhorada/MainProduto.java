package Atv02HerancaMelhorada;

public class MainProduto {
    public static void main(String[] args) {

        Processador processador1 = new Processador("Ryzen", "1600", 2.5);
        Memoria memoria1 = new Memoria(null, null, 0, 0);
        PlacaMae placaMae1 = new PlacaMae(null, null, null);
        

        System.out.println(processador1);
    }

}
