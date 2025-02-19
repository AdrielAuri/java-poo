package Atividades.Atv2;
import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========================================\n");
        System.out.println("Informe quantos Pets deseja cadastrar: ");
        int qtdPets = sc.nextInt();
        sc.nextLine();

        // Criando um array de objetos
        Pet[] pets = new Pet[qtdPets];

        for (int i = 0; i < qtdPets; i++){

            System.out.println("\n================================");
            System.out.println("Informe o nome do pet " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.println("Informe a idade do pet " + (i + 1) + ": ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe a racão do pet " + (i + 1) + ": ");
            String racao = sc.nextLine();
            System.out.println("Informe o porte do pet " + (i + 1) + ": ");
            String porte = sc.nextLine();
            System.out.println("Informe a alimentação do pet " + (i + 1) + ": ");
            String alimentacao = sc.nextLine();

            // Instanciando o objeto e armazenando no array
            pets[i] = new Pet(nome, idade, racao, porte, alimentacao);
        }

        // Exibindo pets cadastrados
        System.out.println("\n=======================\n");
        for (int j = 0; j < qtdPets; j++){
            System.out.println("PET " + (j + 1) + ": ");
            pets[j].status();
        }


        sc.close();
    }
}
