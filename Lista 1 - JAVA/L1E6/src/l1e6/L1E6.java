package l1e6;

import java.util.Scanner;

public class L1E6 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro:");
        int n1 = in.nextInt();
        
        System.out.print("Digite outro número inteiro:");
        int n2 = in.nextInt();
        
        System.out.println("Soma      = "+(n1+n2));
        System.out.println("Produto   = "+(n1*n2));
        System.out.println("Diferença = "+(n1-n2));
        System.out.println("Quociente = "+(n1/n2));
        
        
    }
    
}
