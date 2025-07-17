package Testes;

public class Oficina extends Pecas{

    public Oficina() {
        super(4);
    }

    @Override
    public void Marcha() {
        System.out.println(this.qtdPecas);
        System.out.println("Com ou sem câmbio? Está bicicleta NÃO possue câmbio(marcha).");
    }

    @Override
    public void corQuadro() {
        System.out.println("quadro verde");
    }

    @Override
    public void corGuidom() {
        System.out.println("guidom preto");
    }

    @Override
    public void corAros() {
        System.out.println("aros prateados");
    }
}
