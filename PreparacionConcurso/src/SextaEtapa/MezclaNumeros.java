package SextaEtapa;

import java.util.Arrays;
import java.util.Scanner;

public class MezclaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a+b];
        for (int i = 0; i < a+b; i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < a+b; i++)
            System.out.println(arr[i]+" ");
    }
    
}
