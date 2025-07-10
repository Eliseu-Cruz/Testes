import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args){
        int[][] num = new int[2][2];
        lerMatriz(num);
        System.out.println("Matriz digitada\n");
        mostreMatriz(num);
        diagonal(num);
    }

    public static void mostreMatriz(int[][]n){
        for (int[] linha : n) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static void lerMatriz(int[][] n){
        System.out.println("Digite alguns némeros:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                n[i][j] = sc.nextInt();
                if (n[i][j] < 1){
                    System.out.println("Digite um némero maior que 0");
                    n[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }
    }

    public static void diagonal(int[][]n){
        int coluna = 1;
        int maior = n[0][0];
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                if (maior < n[i][coluna]) {
                    maior = n[i][coluna];
                }
            }
            System.out.println(maior);
        }
    }
}
