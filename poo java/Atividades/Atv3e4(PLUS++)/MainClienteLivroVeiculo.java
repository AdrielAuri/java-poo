package Atividades.Atv3e4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClienteLivroVeiculo {
    public static void main(String[] args) {

        String repetir = "";

        Scanner sc = new Scanner(System.in);

        // Criando um arrayList de objetos
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        do {
            System.out.println("\n======== SAC BAHIA ========");
            System.out.println("\nSERVIÇO DE REGISTRO");
            System.out.println("\n1 - Cliente\n2 - Veículo\n3 - Lívro");
            System.out.printf("\nINFORME A OPÇAO QUE DESEJA: ");
            String opcaoPainel = sc.nextLine();

            switch (opcaoPainel) {

                case "1":
                    System.out.println("\nInforme quantos clientes deseja cadastrar: ");
                    int qtdClientes = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < qtdClientes; i++) {
                        System.out.println("Informe o nome do cliente " + (i + 1) + ":");
                        String nomeCliente = sc.nextLine();
                        System.out.println("Informe a idade do cliente " + (i + 1) + ":");
                        int idadeCliente = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Informe o cpf do cliente " + (i + 1) + ":");
                        String cpfCliente = sc.nextLine();
                        System.out.println("Informe o endereço do cliente " + (i + 1) + ":");
                        String enderecoCliente = sc.nextLine();
                        System.out.println("Informe o telefone do cliente " + (i + 1) + ":");
                        String telefoneCliente = sc.nextLine();

                        // Instanciando um objeto antes de adiciona-lo ao arrayList
                        Cliente novoCliente = new Cliente(nomeCliente, idadeCliente, cpfCliente, enderecoCliente,
                                telefoneCliente);
                        clientes.add(novoCliente);
                    }

                    do {
                        System.out.printf("Deseja realizar mais algum registro (s / n)? ");
                        repetir = sc.nextLine().toLowerCase();

                        if (!repetir.equals("s") && !repetir.equals("n")) {
                            System.out.println("Por favor digite uma opção válida");
                        }
                    } while (!repetir.equals("s") && !repetir.equals("n"));

                    break;

                case "2":
                    System.out.println("\nInforme quantos veículos deseja cadastrar: ");
                    int qtdVeiculos = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < qtdVeiculos; i++) {
                        System.out.println("Informe a placa do veículo " + (i + 1) + ":");
                        String placaVeiculo = sc.nextLine();
                        System.out.println("Informe a cor do veículo " + (i + 1) + ":");
                        String corVeiculo = sc.nextLine();
                        System.out.println("Informe o número de passageiros do veículo " + (i + 1) + ":");
                        int numeroPassageiro = sc.nextInt();
                        System.out.println("Informe a capacidade do tanque veículo " + (i + 1) + ":");
                        double capacidadeTanque = sc.nextDouble();
                        System.out.println("Informe a velocidade máxima do veículo " + (i + 1) + ":");
                        double velocidadeMaxima = sc.nextDouble();
                        System.out.println("Informe o consumo médio do veículo " + (i + 1) + ":");
                        double consumoMedio = sc.nextDouble();
                        sc.nextLine();

                        Veiculo novoVeiculo = new Veiculo(placaVeiculo, corVeiculo, numeroPassageiro, capacidadeTanque,
                                velocidadeMaxima, consumoMedio);
                        veiculos.add(novoVeiculo);
                    }

                    do {
                        System.out.printf("Deseja realizar mais algum registro (s / n)? ");
                        repetir = sc.nextLine().toLowerCase();

                        if (!repetir.equals("s") && !repetir.equals("n")) {
                            System.out.println("Por favor digite uma opção válida");
                        }
                    } while (!repetir.equals("s") && !repetir.equals("n"));

                    break;

                case "3":
                    System.out.println("\nInforme quantos Livros deseja cadastrar: ");
                    int qtdLivros = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < qtdLivros; i++) {
                        System.out.println("Informe o título do livro " + (i + 1) + ":");
                        String titulo = sc.nextLine();
                        System.out.println("Informe o autor do livro " + (i + 1) + ":");
                        String autor = sc.nextLine();
                        System.out.println("Informe o ISBN do livro " + (i + 1) + ":");
                        double isbn = sc.nextDouble();
                        System.out.println("Informe o número de páginas do livro " + (i + 1) + ":");
                        int numeroPaginas = sc.nextInt();
                        System.out.println("Informe o valor de compra para livro " + (i + 1) + ":");
                        double valorCompra = sc.nextDouble();
                        sc.nextLine();

                        Livro novoLivro = new Livro(titulo, autor, isbn, numeroPaginas, valorCompra);
                        livros.add(novoLivro);
                    }

                    do {
                        System.out.printf("Deseja realizar mais algum registro (s / n)? ");
                        repetir = sc.nextLine().toLowerCase();

                        if (!repetir.equals("s") && !repetir.equals("n")) {
                            System.out.println("Por favor digite uma opção válida");
                        }
                    } while (!repetir.equals("s") && !repetir.equals("n"));

                    break;
            }
        } while (repetir.equals("s"));

        do{
        System.out.println("===============================================\n");
        System.out.println("Informe a opção que deseja exibir os registros:");
        System.out.println("\n1 - Cliente\n2 - Veículo\n3 - Lívro");
        System.out.printf("\nINFORME A OPÇAO QUE DESEJA: ");
        String opcaoPainel2 = sc.nextLine();

        switch (opcaoPainel2) {

            case "1":

                System.out.println("====================================\n");
                System.out.println("CLIENTES REGISTRADOS");
                for (Cliente c : clientes) {
                    c.exibirClientes();
                }

                do {
                    System.out.printf("\nDeseja exibir mais algum registro (s / n)? ");
                    repetir = sc.nextLine().toLowerCase();

                    if (!repetir.equals("s") && !repetir.equals("n")) {
                        System.out.println("Por favor digite uma opção válida");
                    }
                } while (!repetir.equals("s") && !repetir.equals("n"));

                break;

            case "2":

                System.out.println("====================================\n");
                System.out.println("VEÍCULOS REGISTRADOS");
                for (Veiculo v : veiculos) {
                    v.exibirVeiculos();
                }

                do {
                    System.out.printf("\nDeseja exibir mais algum registro (s / n)? ");
                    repetir = sc.nextLine().toLowerCase();

                    if (!repetir.equals("s") && !repetir.equals("n")) {
                        System.out.println("Por favor digite uma opção válida");
                    }
                } while (!repetir.equals("s") && !repetir.equals("n"));

                break;

            case "3":

                System.out.println("====================================\n");
                System.out.println("lÍVROS REGISTRADOS");
                for (Livro l : livros) {
                    l.exibirLivros();
                }

                do {
                    System.out.printf("\nDeseja exibir mais algum registro (s / n)? ");
                    repetir = sc.nextLine().toLowerCase();

                    if (!repetir.equals("s") && !repetir.equals("n")) {
                        System.out.println("Por favor digite uma opção válida");
                    }
                } while (!repetir.equals("s") && !repetir.equals("n"));

                break;
        }
    } while (repetir.equals("s"));
    
        System.out.println("Programa finalizada!\nVolte sempre!");

        sc.close();
    }
}
