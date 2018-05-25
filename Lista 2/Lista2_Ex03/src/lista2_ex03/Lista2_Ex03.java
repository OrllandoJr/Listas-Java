package lista2_ex03;

import java.util.Scanner;

public class Lista2_Ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Double n1, n2, n3, m;

        System.out.println("Digite a primeira nota:");
        n1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = in.nextDouble();
        System.out.println("Digite a terceira nota:");
        n3 = in.nextDouble();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("A maior nota é " + n1);
        }
        if ((n2 > n1) && (n2 > n1)) {
            System.out.println("A maior nota é " + n2);
        }
        if ((n3 > n1) && (n3 > n2)) {
            System.out.println("A maior nota é " + n3);
        }

        m = (n1 + n2 + n3) / 3;

        System.out.println("A média das três notas é " + m);
    }
}
