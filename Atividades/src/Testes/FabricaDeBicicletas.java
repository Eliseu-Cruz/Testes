package Testes;

public class FabricaDeBicicletas implements Tintura{

    @Override
    public void corQuadro() {
        System.out.println("Uma bicicleta com o quadro verde.");
    }

    @Override
    public void corGuidom() {
        System.out.println("Uma bicicleta com o guidom preto.");
    }

    @Override
    public void corAros() {
        System.out.println("Uma bicicleta com os aros prateados.");
    }
}