package Atv02HerancaMelhorada;

public class PlacaMae extends Produto{

        protected String soquete;

        public PlacaMae(String marca, String modelo, String soquete) {
            super(marca, modelo);
            this.soquete = soquete;
        }

        @Override
        public String toString() {
            return "PlacaMae [marca=" + marca + ", soquete=" + soquete + ", modelo=" + modelo + "]";
        }



}
