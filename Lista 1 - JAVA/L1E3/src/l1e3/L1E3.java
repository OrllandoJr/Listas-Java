package l1e3;

import java.util.Scanner;

public class L1E3 {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        System.out.print("Digite um número de 3 digitos: ");
        
        final Integer n = in.nextInt();
        
        final String a = n.toString();
        
        String b = "";
        
        for (int i = a.length(); i > 0; i--) {
            b += a.substring(i - 1, i);
        }
        System.out.println("A inversão é:" + b);

    }

}
