
import java.util.Scanner;

public class Lapices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cont=0,lec;
        for (int i = 0; i < n; i++) {
            lec=sc.nextInt();
            if (lec==k) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}
