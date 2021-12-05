package TerceraEtapa;

import java.util.Arrays;
import java.util.Scanner;

public class ElMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++)
            m[i]=sc.nextInt();
        Arrays.sort(m);
        System.out.println(m[n-1]);
    }
}
