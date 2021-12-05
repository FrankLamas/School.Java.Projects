package SextaEtapa;

import java.util.Scanner;

public class DivCad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        cad = cad.toUpperCase();
        char[] arr = cad.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(cad);
        char n = sc.next().charAt(0);
        System.out.println((int)n);
    }
}
