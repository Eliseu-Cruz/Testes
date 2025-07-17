package Interfaces;

public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Renegate();
        Carro meuCarro2 = new Ferrari();

        meuCarro.acelerador();
        meuCarro2.acelerador();

        Humano novoSer = new Humano();
        novoSer.respirar();
        novoSer.dormir();
    }
}
