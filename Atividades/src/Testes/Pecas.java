package Testes;

public abstract class Pecas implements Tintura {
        public int qtdPecas;

        public Pecas(int num){
            this.qtdPecas = num;
        }

    public void Partes(){
        String quadro = "Quadro";
        this.corQuadro();
        String aro = "aro";
        this.corAros();
        String guidom = "guidom";
        this.corGuidom();
        String rodas = "Rodas";
        System.out.println("Está bicicleta vem com: " + quadro + ", " + aro + ", " + guidom + ", e " + rodas + ".");
    }

    public abstract void Marcha();
}
