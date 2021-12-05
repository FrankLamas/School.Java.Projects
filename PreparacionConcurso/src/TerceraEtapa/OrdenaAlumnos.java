package TerceraEtapa;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenaAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] alumnos = new int[n];
        for (int i = 0; i < n; i++)
            alumnos[i]=sc.nextInt();
        Arrays.sort(alumnos);
        for (int i = n-1; i >= 0; i--)
            System.out.print(alumnos[i]+" ");
    }
}
