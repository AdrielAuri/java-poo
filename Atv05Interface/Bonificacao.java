package Atv05Interface;

public enum Bonificacao {
    GERENTE (1.2),
    DIRETOR (1.4);

    private final double valorBonificacao;

    private Bonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public double getValorBonificacao() {
        return valorBonificacao;
    }

}
