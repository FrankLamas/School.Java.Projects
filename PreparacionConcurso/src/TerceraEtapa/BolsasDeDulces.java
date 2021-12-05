package TerceraEtapa;

import java.util.Scanner;

public class BolsasDeDulces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma=0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            suma= suma + (a*b);
        }
        System.out.println(suma);
    }
}
