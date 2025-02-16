package Atividades.Atv3e4;

public class Livro {
    
    private String titulo;
    private String autor;
    private double isbn;
    private int numeroPaginas;
    private double valorCompra;

    void exibirLivros (){
        
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Valor de compra: R$" + valorCompra);
        System.out.printf("\n");
    }

    public Livro(String titulo, String autor, double isbn, int numeroPaginas, double valorCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.valorCompra = valorCompra;
    }
    
    public String getTitulo() {
        return titulo;
    }
  public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getIsbn() {
        return isbn;
    }
    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }


    
}
