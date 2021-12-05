
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falco
 */
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        float factorial = 1;
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El factorial es: " + factorial);
        System.out.println(factorial%2!=0?"No es par":"Es par");
    }
}
