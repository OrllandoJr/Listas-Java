package l1e10;

import java.lang.Math;
import java.util.Scanner;

public class L1E10 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio de um circulo:");
        int r = in.nextInt();
        
        double A = (Math.pow(Math.PI, 2));
        double C = (2*Math.PI*r);
        int D = (2*r);
        
        System.out.println("O diâmetro do circulo é "+D);
        System.out.printf("A circunferência é %.1f\n",C);
        System.out.printf("A área é %.1f\n",A);
                       
    }
    
}
