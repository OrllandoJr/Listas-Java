package lista3_ex09;

import java.util.Scanner;

public class Lista3_Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número e saiba se é primo:");
        int n = in.nextInt();

        int cont = 0;

        for (int x = 2; x <= (n - 1); x++) {
            if (n % x == 0) {
                cont = cont + 1;
            }
        }

        if (cont == 0) {
            System.out.println("O número é PRIMO!");
        } else {
            System.out.println("O número não é primo!");
        }

    }

}
