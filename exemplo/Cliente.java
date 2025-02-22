package exemplo;

// necessário usar extends para herdar os atributos de outra classe
public class Cliente extends Pessoa{
    
    private String dataDeCompra;
    private String formaDePagamento;

    public Cliente() {
    }

    public Cliente(String nome, int idade, String dataDeCompra, String formaDePagamento) {
        
        // Super está se referindo a classe Pessoa que será usada como herança
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente [dataDeCompra=" + dataDeCompra + ", formaDePagamento=" + formaDePagamento + ", nome=" + nome
                + ", idade=" + idade + "]";
    }

    

    
}
