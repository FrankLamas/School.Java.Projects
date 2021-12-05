package TerceraEtapa;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cant = sc.nextDouble();
        System.out.println((cant>1000?cant*0.85:cant));
    }
}
