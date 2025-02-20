package Atividades.Atv7Relacionamento;
import java.util.Scanner;

public class MainContaFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código do funcionário: ");
        String codigoFuncionario = sc.nextLine();
        System.out.println("Informe o nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.println("Informe o endereço: ");
        String enderecoFuncionario = sc.nextLine();
        System.out.println("Informe o telefone: ");
        String telefoneFuncionario = sc.nextLine();
        System.out.println("Informe o e-mail: ");
        String emailFuncionario = sc.nextLine();

        System.out.println("Informe o banco do funcionário: ");
        String bancoFuncionario = sc.nextLine();
        System.out.println("Informe a agência: ");
        String agenciaFuncionario = sc.nextLine();
        System.out.println("Informe o numero da conta: ");
        String numeroConta = sc.nextLine();
        System.out.println("Informe o tipo da conta: ");
        String tipoConta = sc.nextLine();
        System.out.println("Informe o saldo da conta: ");
        double saldoConta = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe a agência: ");
        double limiteDisponivel = sc.nextDouble();

        Funcionario funcionarios = new Funcionario(codigoFuncionario, nomeFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario, 
        new ContaBancaria(bancoFuncionario, agenciaFuncionario, numeroConta, tipoConta, saldoConta, limiteDisponivel));

        System.out.println(funcionarios.toString());

        sc.close();
    }
    
}
