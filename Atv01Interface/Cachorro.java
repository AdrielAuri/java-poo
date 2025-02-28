package Atv01Interface;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
    return "Auuuuul";
    }

    @Override
    public String comer() {
        return "Ração";
    }


}
