import models.Pessoa;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Adriel", 27, "adriel@gmail.com");
        
        pessoa.setNome("Adriel Auri");
        pessoa.setIdade(27);
        pessoa.setEmail("adriel@gmail.com");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());

    }
}
