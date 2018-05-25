package lista1_ex01;

import java.util.Scanner;

public class Lista1_Ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, S, D, P, M;

        System.out.println("Digite o primeiro valor: ");
        n1 = in.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = in.nextInt();

        S = n1 + n2;
        D = n1 - n2;
        P = n1 * n2;
        M = S/2;

        System.out.println("Soma: "+S);
        System.out.println("Diferença: "+D);
        System.out.println("Produto: "+P);
        System.out.println("Média: "+M);
    }

}
