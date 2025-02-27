package Atv02HerancaMelhorada;

public class Memoria extends Produto{

    public Memoria(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
        super(marca, modelo, frequencia, capacidadeDeArmazenamento);
    }

    @Override
    public String toString() {
        return "Memoria" + super.toStringTodos();
    }
    
    

}
