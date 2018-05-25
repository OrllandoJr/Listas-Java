package lista3_ex01;

import java.util.Scanner;

public class Lista3_Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2, base;
        int cont;

        System.out.println("Digite o primeiro número:");
        n1 = in.nextDouble();

        base = n1;

        for (cont = 0; cont < 15; cont++) {
            System.out.println("Digite o proximo número:");
            n2 = in.nextDouble();

            if (n2 > n1) {
                n1 = n2;
            }

            if (n2 < base) {
                base = n2;
            }

            cont = cont + 1;
        }

        System.out.println("O maior número é " + n1);
        System.out.println("O menor número é " + base);

    }

}
