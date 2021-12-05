package CuartaEtapa;
import java.util.Scanner;
public class SumaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v1 = new int[n];
        for (int i =0; i<n;i++)
            v1[i]=sc.nextInt();
        int[] v2 = new int[n];
        for (int i =0; i<n;i++)
            v2[i]=sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print((v1[i]+v2[i])+" ");
    }
}
