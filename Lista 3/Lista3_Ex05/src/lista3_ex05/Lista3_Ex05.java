package lista3_ex05;

import java.util.Scanner;

public class Lista3_Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, n, p, i;

        p = 0;

        i = 0;

        System.out.println("Digite a quantidade de números que irá digitar: ");
        y = in.nextInt();

        for (x = 1; x <= y; x++) {

            System.out.println("Digite um valor inteiro maior que 0 e menor que 1001: ");
            n = in.nextInt();

            if ((n < 0) || (n > 1000)) {
                System.out.println("Valor invalido!");
                break;
            }

            if (n % 2 == 0) {
                p = p + n;
            } else {
                i = i + n;
            }
        }

        System.out.println("A soma dos números PARES é " + p);
        System.out.println("A soma dos números ÍMPARES é " + i);

    }

}
