package Atividades.Atv3e4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Criando um arrayList de objetos
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();

        System.out.println("\n======== SAC BAHIA ========");
        System.out.println("\nSERVIÇO DE REGISTRO");
        System.out.println("\n1 - Cliente\n2 - Veículo\n3 - Lívro");
        System.out.printf("\nINFORME A OPÇAO QUE DESEJA: ");
        String opcaoPainel = sc.nextLine();

        switch (opcaoPainel){

            case "1":
                System.out.println("\nInforme quantos clientes deseja cadastrar: ");
                int qtdClientes = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < qtdClientes; i++){
                    System.out.println("Informe o nome do cliente "+ (i+1) + ":");
                    String nomeCliente = sc.nextLine();
                    System.out.println("Informe a idade do cliente "+ (i+1) + ":");
                    int idadeCliente = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Informe o cpf do cliente "+ (i+1) + ":");
                    String cpfCliente = sc.nextLine();
                    System.out.println("Informe o endereço do cliente "+ (i+1) + ":");
                    String enderecoCliente = sc.nextLine();
                    System.out.println("Informe o telefone do cliente "+ (i+1) + ":");
                    String telefoneCliente = sc.nextLine();

                    // Instanciando um objeto antes de adiciona-lo ao arrayList
                    Cliente novoCliente = new Cliente(nomeCliente, idadeCliente, cpfCliente, enderecoCliente, telefoneCliente);
                    clientes.add(novoCliente);
                }
                break;

            case "2":
                System.out.println("\nInforme quantos veículos deseja cadastrar: ");
                int qtdVeiculos = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < qtdVeiculos; i++){
                    System.out.println("Informe a placa do veículo "+ (i+1) + ":");
                    String placaVeiculo = sc.nextLine();
                    System.out.println("Informe a cor do veículo "+ (i+1) + ":");
                    String corVeiculo = sc.nextLine();
                    System.out.println("Informe o número de passageiros do veículo "+ (i+1) + ":");
                    int numeroPassageiro = sc.nextInt();
                    System.out.println("Informe a capacidade do tanque veículo "+ (i+1) + ":");
                    double capacidadeTanque = sc.nextDouble();
                    System.out.println("Informe a velocidade máxima do veículo "+ (i+1) + ":");
                    double velocidadeMaxima = sc.nextDouble();
                    System.out.println("Informe o consumo médio do veículo "+ (i+1) + ":");
                    double consumoMedio = sc.nextDouble();

                    Veiculo novoVeiculo = new Veiculo(placaVeiculo, corVeiculo, numeroPassageiro, capacidadeTanque, velocidadeMaxima, consumoMedio);
                    veiculos.add(novoVeiculo);
                }
                break;

            case "3":
                System.out.println("\nInforme quantos Livros deseja cadastrar: ");
                int qtdLivros = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < qtdLivros; i++){
                    System.out.println("Informe o título do livro "+ (i+1) + ":");
                    String titulo = sc.nextLine();
                    System.out.println("Informe o autor do livro "+ (i+1) + ":");
                    String autor = sc.nextLine();
                    System.out.println("Informe o ISBN do livro "+ (i+1) + ":");
                    double isbn = sc.nextDouble();
                    System.out.println("Informe o número de páginas do livro "+ (i+1) + ":");
                    int numeroPaginas = sc.nextInt();
                    System.out.println("Informe o valor de compra para livro "+ (i+1) + ":");
                    double valorCompra = sc.nextDouble();

                    Livro novoLivro = new Livro(titulo, autor, isbn, numeroPaginas, valorCompra);
                    livros.add(novoLivro);
                }
        }

            System.out.println("Informe a opção que deseja exibir os registros:");
            System.out.println("\n======== SAC BAHIA ========");
            System.out.println("\nSERVIÇO DE REGISTRO");
            System.out.println("\n1 - Cliente\n2 - Veículo\n3 - Lívro");
            System.out.printf("\nINFORME A OPÇAO QUE DESEJA: ");
            String opcaoPainel2 = sc.nextLine();

            switch (opcaoPainel2){

                case "1":

                System.out.println("====================================\n");
                System.out.println("Clientes registrados");
                for (Cliente c : clientes){
                    c.exibirClientes();
                }
                break;

                case "2":

                System.out.println("====================================\n");
                System.out.println("Veículos registrados");
                for (Veiculo v : veiculos){
                    v.exibirVeiculos();
                }
                break;

                case "3":

                System.out.println("====================================\n");
                System.out.println("Livros registrados");
                for (Livro l : livros){
                    l.exibirLivros();
                }
            }

        sc.close();
    }
}
