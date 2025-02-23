

public class PlacaMae extends Geracao{

    private String soquete;

    public PlacaMae(String nome, String modelo, String soquete) {
        super(nome, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae [nome= " + nome + ", soquete= " + soquete + ", modelo= " + modelo + "]";
    }
    
}
