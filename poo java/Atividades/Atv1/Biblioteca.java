package Atividades.Atv1;

public class Biblioteca {

    private String livro;
    private String autor;
    private int numDePaginas;
    private double preco;

    void status (){

        System.out.printf("\nNome do livro : %s", this.livro);        
        System.out.printf("\nNome do autor: %s", this.autor);
        System.out.printf("\nNúmero de páginas: %d", this.numDePaginas);
        System.out.printf("\nPreço do: R$ %.2f\n", this.preco);
    }

    public Biblioteca(String livro, String autor, int numDePaginas, double preco) {
        this.livro = livro;
        this.autor = autor;
        this.numDePaginas = numDePaginas;
        this.preco = preco;
    }

    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumDePaginas() {
        return numDePaginas;
    }
    public void setNumDePaginas(int numDePaginas) {
        this.numDePaginas = numDePaginas;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
