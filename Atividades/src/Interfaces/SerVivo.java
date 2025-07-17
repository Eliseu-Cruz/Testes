package Interfaces;

public abstract class SerVivo{

    /* Existem duas formas de fazer uma classe abstrata retornar um conteúdo, instânciando aqui mesmo ou em
    outra classe. Que são esses dois aqui debaixo*/
    public abstract void respirar();

    public abstract void dormir();

    public void alimenta(){
        System.out.println("Todo ser vivo alimenta-se.");
    }

}

