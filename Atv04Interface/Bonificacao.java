package Atv04Interface;

// Ao usar valores em enum é necessário criar uma variável para armazenar o valor da bonificação
public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);

    private final double valorBonificacao;

    // Também é necessário criar um construtor para iniciar o valor de cada enum
    private Bonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    // E um getter para acessar o valor da bonificação
    public double getValorBonificacao() {
        return valorBonificacao;
    }

    


}
