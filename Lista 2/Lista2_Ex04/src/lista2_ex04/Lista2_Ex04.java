package lista2_ex04;

import java.util.Scanner;

public class Lista2_Ex04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, n3;
        char x;

        System.out.println("Digite o primeiro valor:");
        n1 = in.nextDouble();
        System.out.println("Digite o segundo valor:");
        n2 = in.nextDouble();
        System.out.println("Digite o terceiro valor:");
        n3 = in.nextDouble();

        System.out.println("Dgite 'C' para ordem Crescente ou 'D' para Decrescente:");
        x = in.next().charAt(0);

        if (x == 'c') {
            if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
                System.out.println(n3+", " +n2+", " +n1);
            } else if ((n1 > n2) && (n1 > n3) && (n3 > n2)) {
                System.out.println(n2+ ", " +n3+", " +n1);
            } else if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
                System.out.println(n3+ ", " +n1+ ", " +n2);
            } else if ((n2 > n3) && (n2 > n1) && (n3 > n1)) {
                System.out.println(n1+", " +n3+ ", "  +n2);
            } else if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
                System.out.println(n2+", " +n1+", " +n3);
            } else if ((n3 > n2) && (n3 > n1) && (n2 > n1)) {
                System.out.print(n1+", " + n2+", " +n3);
            }
        }
            if (x == 'd') {
                if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
                    System.out.println(n1+", "+ n2+", " + n3);
                } else if ((n1 > n2) && (n1 > n3) && (n3 > n2)) {
                    System.out.println(n1 +", "+ n3 +", "+ n2);
                } else if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
                    System.out.println(n2 +", "+ n1 +", "+ n3);
                } else if ((n2 > n3) && (n2 > n1) && (n3 > n1)) {
                    System.out.println(n2 +", "+ n3 +", "+ n1);
                } else if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
                    System.out.println(n3 +", "+ n1 +", "+ n2);
                } else if ((n3 > n2) && (n3 > n1) && (n2 > n1)) {
                    System.out.println(n3 +", "+ n2 +", "+ n1);
                }
        }
    }
}
