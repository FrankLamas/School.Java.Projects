package Programas;

import java.util.Scanner;


public class programa1 {
public void area() {
    Scanner sc = new Scanner (System.in);
        double b, a, result;
        
        System.out.println("proporciona base");
        b = sc.nextDouble();
        
        System.out.println("proporciona altura");
        a = sc.nextDouble();
        
        result = b * a/2;
        
        System.out.println("resultado" + result);
}    
}
