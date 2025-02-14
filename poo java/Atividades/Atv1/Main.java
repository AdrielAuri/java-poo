package Atividades.Atv1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme o Título do livro 1: ");
        String livro1 = sc.nextLine();
        System.out.println("\nInforme o autor do livro 1: ");
        String autorLivro1 = sc.nextLine();
        System.out.println("\nInforme o número de páginas do livro 1: ");
        int paginasLivro1 = sc.nextInt();
        System.out.println("\nInforme o preço do livro 1: ");
        double precoLivro1 = sc.nextDouble();

        Biblioteca biblioteca1 = new Biblioteca(livro1, autorLivro1, paginasLivro1, precoLivro1);
        
        sc.nextLine();
        System.out.println("\n\nInforme o Título do livro 2: ");
        String livro2 = sc.nextLine();
        System.out.println("\nInforme o autor do livro 2: ");
        String autorLivro2 = sc.nextLine();
        System.out.println("\nInforme o número de páginas do livro 2: ");
        int paginasLivro2 = sc.nextInt();
        System.out.println("\nInforme o preço do livro 2: ");
        Double precoLivro2 = sc.nextDouble();

        Biblioteca biblioteca2 = new Biblioteca(livro2, autorLivro2, paginasLivro2, precoLivro2);

        System.out.println("\n\n=======================");
        System.out.println("Informações do livro 1");
        biblioteca1.status();
        System.out.println("=======================");
        System.out.println("Informações do livro 2");
        biblioteca2.status();
        System.out.println("\n");

        sc.close();
    }

}
