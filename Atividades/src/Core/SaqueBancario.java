package Core;

public class SaqueBancario {

    public static void main(String[] args){
        funcionario funcio = new funcionario("Eliseu", 1500);
        funcio.mostraSalario();
    }

    static class funcionario {
        String nome;
        double salario;

        public funcionario(String nome, double salario){
            this.nome = nome;
            this.salario = salario;
        }

        public void mostraSalario(){
            double aumento = (salario * 10 / 100) + salario;
            System.out.println("Funcionário " + nome + " tinha como salário " + salario + "\nCom o aumento de 10% passa a ser " + aumento + ".");
        }
    }
}
