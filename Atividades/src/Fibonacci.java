public class Fibonacci {
    public static void main(String[] args){
        int[][] m = new int[3][3];
        fibo(m);
        mostra(m);
    }
    public static void mostra(int[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fibo(int[][] m){
        int a = 1, b = 1, c = a+b;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = a;
                a = b;
                b = c;
                c = a+b;
            }
        }
    }
}
