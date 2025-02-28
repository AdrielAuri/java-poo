package Atv01Interface;

public class Gato implements Animal{

    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public String comer() {
        return "Whiskas";
    }

}
