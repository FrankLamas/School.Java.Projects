
package SegundaEtapa;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(((n+k)<0?(n+k)*-1:(n+k)));
    }
}
