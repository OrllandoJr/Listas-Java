package l1e9;

import java.util.Scanner;

public class L1E9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro:");
        int n1 = in.nextInt();
        System.out.print("Digite o segundo número inteiro:");
        int n2 = in.nextInt();

        if (n2 % n1 == 0) {
            System.out.println(n1 + " é multiplo de " + n2);
        } else {
            System.out.println(n1 + " NÃO é multiplo de " + n2);
        }

    }
}
