package Core;

public class Poo {

    public static void main(String[] args){
        Carro meuCarro = new Carro("Corsa","Rosa");
        meuCarro.acelerar();
    }

    static class Carro{
        String modelo;
        String cor;

        public Carro(String modelo, String cor){
            this.modelo = modelo;
            this.cor = cor;
        }

        public void acelerar() {
            System.out.println("Acelerando o " + this.modelo + " " + this.cor);
        }
    }
}