package Atividades.Atv2;

public class Pet {
    
    private String nomePet;
    private int idadePet;
    private String racaoPet;
    private String portePet;
    private String alimentacaoPet;

    void status (){
        System.out.printf("Nome: %s\n", nomePet);
        System.out.printf("Idade: %d\n", idadePet);
        System.out.printf("Ração: %s\n", racaoPet);
        System.out.printf("Porte: %s\n", portePet);
        System.out.printf("Alimentação: %s\n\n", alimentacaoPet);
    }
    
    public Pet(String nomePet, int idadePet, String racaoPet, String portePet, String alimentacao) {
        this.nomePet = nomePet;
        this.idadePet = idadePet;
        this.racaoPet = racaoPet;
        this.portePet = portePet;
        this.alimentacaoPet = alimentacao;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public int getIdadePet() {
        return idadePet;
    }
    public void setIdadePet(int idadePet) {
        this.idadePet = idadePet;
    }
    public String getRacaoPet() {
        return racaoPet;
    }
    public void setRacaoPet(String racaoPet) {
        this.racaoPet = racaoPet;
    }
    public String getPortePet() {
        return portePet;
    }
    public void setPortePet(String portePet) {
        this.portePet = portePet;
    }
    public String getAlimentacao() {
        return alimentacaoPet;
    }
    public void setAlimentacao(String alimentacao) {
        this.alimentacaoPet = alimentacao;
    }
}


