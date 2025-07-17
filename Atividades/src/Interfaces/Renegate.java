package Interfaces;

public class Renegate implements Carro{
    @Override
    public void acelerador() {
        System.out.println("Isto serve para acelerar o carro, podendo chegar até 130km.");
    }

    @Override
    public void embreagem() {
        System.out.println("Isto trava a movimentação do carro enquanto pressionado.");
    }

    @Override
    public void freio() {
        System.out.println("Isto freia os pneus do carro enquanto pressionado");
    }
}
