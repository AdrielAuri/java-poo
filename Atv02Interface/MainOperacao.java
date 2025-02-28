package Atv02Interface;
import java.util.Scanner;

public class MainOperacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Somar somar = new Somar();
        Subtrair subtrair = new Subtrair();
        Multiplicar multiplicar = new Multiplicar();
        Dividir dividir = new Dividir();

        double no1;
        double no2;
        String opcao;

        System.out.println("\n===== Calculadora =====");
        System.out.println("\nInforme o primeiro número: ");
        no1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        no2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEscolha uma das operações a seguir");
        System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Divisão\n\nInforme aqui: ");
        opcao = sc.nextLine();

        switch (opcao) {
            case "1":

                System.out.println("\nOperação escolhida: SOMA");
                System.out.println("Resultado: " + somar.calcular(no1, no2));
                System.out.println();
                
                break;

            case "2":

                System.out.println("\nOperação escolhida: SUBTRAÇAO");
                System.out.println("Resultado: " + subtrair.calcular(no1, no2));
                System.out.println();

                break;

            case "3":

                System.out.println("\nOperação escolhida: MULTIPLICAÇÃO");
                System.out.println("Resultado: " + multiplicar.calcular(no1, no2));
                System.out.println();

                break;

            case "4":

                System.out.println("\nOperação escolhida: DIVISÃO");
                System.out.println("Resultado: " + dividir.calcular(no1, no2));
                System.out.println();

                break;
        }


        sc.close();
    }

}
