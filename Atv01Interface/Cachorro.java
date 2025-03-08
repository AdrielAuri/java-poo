package Atv01Interface;

public class Cachorro implements Animal{

    // sobescrita de método
    @Override
    public String emitirSom() {
    return "Auuuuul";
    }

    @Override
    public String comer() {
        return "Ração";
    }


}
