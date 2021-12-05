package TerceraEtapa;

import java.util.Scanner;

public class JuanYPedro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Juan = sc.nextInt()+sc.nextInt()+sc.nextInt();
        int Pedro = sc.nextInt()+sc.nextInt();
        System.out.println((Juan>Pedro&&Pedro<Juan?"Juan":"Pedro"));
    }
}
