package Interfaces;

public class Ferrari implements Carro{

    @Override
    public void acelerador() {
        System.out.println("Isto serve para acelerar o carro, ACELERANDO ATÉ 330km.");
    }

    @Override
    public void embreagem() {
        System.out.println("SUPER EMBREAGEM.");
    }

    @Override
    public void freio() {
        System.out.println("SUPER ABS.");
    }
}
