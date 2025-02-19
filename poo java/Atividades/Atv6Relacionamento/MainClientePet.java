package Atividades.Atv6Relacionamento;
import java.util.Scanner;

public class MainClientePet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Informe a idade do cliente: ");
        String idade = sc.nextLine();
        System.out.println("Informe o nome do pet: ");
        String nomePet = sc.nextLine();
        System.out.println("Informe a idade do pet: ");
        String idadePet = sc.nextLine();
        System.out.println("Informe a raça do pet: ");
        String racaPet = sc.nextLine();

        Cliente cliente1 = new Cliente(nomePet, idadePet, new Pet(nomePet, idadePet, racaPet));

        System.out.println(cliente1.toString());


        sc.close();
    }


    
}
