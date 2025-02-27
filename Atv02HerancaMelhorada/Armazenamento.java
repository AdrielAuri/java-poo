package Atv02HerancaMelhorada;

public class Armazenamento extends Produto{

    protected String tipoDeConexao;

    public Armazenamento(String marca, double capacidadeDeArmazenamento, String modelo, String tipoDeConexao) {
        super(marca, capacidadeDeArmazenamento, modelo);
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "Armazenamento [marca=" + marca + ", tipoDeConexao=" + tipoDeConexao + ", modelo=" + modelo
                + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }

}
