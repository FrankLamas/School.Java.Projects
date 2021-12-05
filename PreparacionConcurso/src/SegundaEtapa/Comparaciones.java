package SegundaEtapa;

import java.util.Arrays;
import java.util.Scanner;

public class Comparaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] cont = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i]=sc.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i]==arr[j])
                    cont[i]++;
            }
        }
        Arrays.sort(cont);
        switch(cont[4]){
            case 1:
                System.out.println("Muy diferentes");
                break;
            case 2:
                System.out.println("Diferentes");
                break;
            case 3:
                System.out.println("Iguales");
                break;
            case 4:
                System.out.println("Muy iguales");
                break;
            case 5:
                System.out.println("Identicamente iguales");
                break;
        }
    }
}