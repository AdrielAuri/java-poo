import models.Pessoa;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Adriel", 27, "adriel@gmail.com");
        
        pessoa.setNome("Adriel Auri");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
        
        // pessoa.nome = "Marta";

        

    }
}
