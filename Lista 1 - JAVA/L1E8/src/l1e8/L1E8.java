package l1e8;

import java.util.Scanner;

public class L1E8 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor:");
        int n1 = in.nextInt();
        System.out.print("Digite o segundo valor:");
        int n2 = in.nextInt();
        System.out.print("Digite o terceiro valor:");
        int n3 = in.nextInt();
        
        int maior,menor;
        //maior
        if ((n1>n2)&&(n1>n3)){
            maior = n1;
        }else
        if ((n2>n1)&&(n2>n3)){
            maior = n2;
        }else maior = n3;
        
        //menor
        if ((n1<n2)&&(n1<n3)){
            menor = n1;
        }else
            if ((n2<n1)&&(n2<n3)){
                menor = n2;
            }else menor = n3;
                        
        
        System.out.println("\nSoma    = "+(n1+n2+n3));
        System.out.println("Média   = "+(n1+n2+n3)/3);
        System.out.println("Produto = "+(n1*n2*n3));
        System.out.println("Maior   = "+maior);
        System.out.println("Menor   = "+menor);
    }
    
}
