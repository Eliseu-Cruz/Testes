import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int[][] num = new int[2][2];
        usuario(num);
        mostra(num);
        diagonal(num);
    }

    public static void mostra(int[][]n){
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void usuario(int[][] n){
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
        int maior = n[0][0];
        //int numero = 0;
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){

                for (int k = 0; k < n[i].length; k++) {
                    if (maior < n[i][i]) {
                        maior = n[k][i];
                    }
                }
                System.out.println(maior);
            }
        }
    }
}