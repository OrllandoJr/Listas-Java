package lista3_ex08;

import java.util.Scanner;

public class Lista3_Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int x = in.nextInt();
        int i;

        System.out.println("São PARES");
        for (i = 0; i <= x; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("São ÍMPARES:");
        for (i = 1; i <= x; i = i + 2) {
            System.out.println(i);
        }

    }

}
