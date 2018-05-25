package lista1_ex02;

import java.util.Scanner;

public class Lista1_Ex02 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double c, f ;
    
        System.out.println("Transforme ºC em ºF");
        System.out.println("\nDigite uma temperatura em ºC: ");
        c = in.nextDouble();
        
         f = (9 * c +160) / 5;
         
         System.out.println("\nA temperatura em ºF é "+f );
    }
    
}
