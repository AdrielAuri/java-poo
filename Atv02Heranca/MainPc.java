import java.util.Scanner;

public class MainPc {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner (System.in);

        System.out.println("\n===== CONFIGURAÇÃO DO  PROCESADOR =====");
        System.out.println("\nInforme o nome do processador: ");
        String nomeProcessador = sc.nextLine();
        System.out.println("Informe o modelo do processador: ");
        String modeloProcessador = sc.nextLine();
        System.out.println("Informe a frequência do processador: ");
        String frequenciaProcessador = sc.nextLine();

        Processador processador1 = new Processador(nomeProcessador, modeloProcessador, frequenciaProcessador);

        System.out.println("\n===== CONFIGURAÇÃO DA MEMÓRIA =====");
        System.out.println("\nInforme o nome da memória: ");
        String nomeMemoria = sc.nextLine();
        System.out.println("Informe o modelo da memória: ");
        String modeloMemoria = sc.nextLine();
        System.out.println("Informe a capacidade da memória: ");
        double armazenamentoMemoria = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe a frequência da memória: ");
        String frequenciaMemoria = sc.nextLine();

        Memoria memoria1 = new Memoria(nomeMemoria, modeloMemoria, armazenamentoMemoria, frequenciaMemoria);

        System.out.println("\n===== CONFIGURAÇÃO DA PLACA MÃE =====");
        System.out.println("\nInforme o nome da placa mãe: ");
        String nomePlacaMae = sc.nextLine();
        System.out.println("Informe o modelo da placa mãe: ");
        String modeloPlacaMae = sc.nextLine();
        System.out.println("Informe o nome o soquete da placa mãe: ");
        String soquetePlacaMae = sc.nextLine();

        PlacaMae placaMae1 = new PlacaMae(nomePlacaMae, modeloPlacaMae, soquetePlacaMae);

        System.out.println("\n===== CONFIGURAÇÃO DO DISPOSITIVO DE ARMZENAMENTO =====");
        System.out.println("\nInforme o nome do dispositivo de armazenamento: ");
        String nomeDispositivoArmazenamento = sc.nextLine();
        System.out.println("Informe o modelo do dispositivo de armazenamento: ");
        String modeloDispositivoArmazenamento = sc.nextLine();
        System.out.println("Informe a capacidade de armazenamento: ");
        int capacidadeDeArmazenamento1 = sc.nextInt();
        System.out.println("Informe o tipo de conexão do dispositivo de armazenamento: ");
        String conexaoDispositivoArmazenamento = sc.nextLine();

        Armazenamento armazenamento1 = new Armazenamento(nomeDispositivoArmazenamento, modeloDispositivoArmazenamento, capacidadeDeArmazenamento1, 
        conexaoDispositivoArmazenamento);

        System.out.println("\n===== CONFIGURAÇÃO FINALIZADA =====");
        System.out.println();
        System.out.println(processador1);
        System.out.println();
        System.out.println(memoria1);
        System.out.println();
        System.out.println(placaMae1);
        System.out.println();
        System.out.println(armazenamento1);

        sc.close();
    }
}
