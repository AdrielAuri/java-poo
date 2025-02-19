package Atividades.Atv5Relacionamento;

public class MainClienteEndereco {

    public static void main(String[] args) {

        // Versão 1.
        Endereco endereco1 = new Endereco("Rua X", "64", "Salvador");
        Cliente cliente1 = new Cliente(null, null, endereco1);

        System.out.println(cliente1.toString());


        // Versão 2.

        Cliente cliente2 = new Cliente(null, null, 
        new Endereco("Rua Y", "25", "Minas Gerais"));
        
        System.out.println(cliente2.toString());        


    }
    
}
