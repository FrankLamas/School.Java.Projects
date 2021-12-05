
import java.util.Scanner;

public class AliciaLlaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] puertas = new int[m];
        for (int i = 0; i < m; i++) {
            puertas[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] llaves = new int[n];
        int[] resp = new int[n];
        for (int i = 0; i < n; i++) {
            llaves[i] = sc.nextInt();
            for (int j = 0; j < m; j++) {
                if (llaves[i]==puertas[j]) {
                    resp[i]=j+1;
                    j=m;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(resp[i]+" ");
        }
    }
}
