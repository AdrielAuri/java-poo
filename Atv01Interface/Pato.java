package Atv01Interface;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "Quá quá";
    }

    @Override
    public String comer() {
        return "vegetal";
    }

}
