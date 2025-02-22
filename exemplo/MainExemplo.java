package exemplo;

public class MainExemplo {
    public static void main(String[] args) {

        
        Cliente cliente1 = new Cliente("Adriel", 27, "10/02/2023", "Pix");
        Funcionario funcionario1 = new Funcionario("Marta", 48, "ABC123", "Programador", 1880);

        System.out.println();
        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario1.toString());
        System.out.println();
    }


}
