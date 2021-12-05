package TerceraEtapa;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean diag1 = true;
        boolean diag2 = true;
        int n = sc.nextInt();
        int[][] Matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++)
                Matriz[i][j]=sc.nextInt();
        }
        int n1 = Matriz[0][0];
        int n2 = Matriz[0][n-1];
        for (int i = 0; i < n; i++) {
            if (Matriz[i][i]!=n1) {
                diag1=false;
                i=n;
            }
        }
        int k = n;
        for (int i = 0; i < n; i++) {
            if (Matriz[i][k-1]!=n1) {
                diag2=false;
                i=n;
            }
            
            k=(k!=0?k-1:k);
        }
        System.out.println((diag1==false&&diag2==false?"NO":"SI"));
    }
}
