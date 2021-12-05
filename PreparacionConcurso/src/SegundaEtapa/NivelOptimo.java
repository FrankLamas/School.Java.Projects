package SegundaEtapa;

import java.util.Scanner;

public class NivelOptimo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1==n2) {
            System.out.println("Nivel Optimo");
        }else{
            if (n1<n2) {
                System.out.println(1+" "+(n2-n1));
            }else{
                System.out.println(2+" "+((n2-n1)<0?(n2-n1)*(-1):(n2-n1)));
            }
        }
    }
}
