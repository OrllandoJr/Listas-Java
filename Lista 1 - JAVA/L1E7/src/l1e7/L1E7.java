package l1e7;

import java.util.Scanner;

public class L1E7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Você digitará 2 números inteiros.");
        System.out.print("Digite o primeiro número:");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número:");
        int n2 = in.nextInt();

        if (n1 == n2) {
            System.out.println("These numbers are equal");
        } else {

            if (n1 > n2) {
                System.out.println(n1 + " is langer");
            } else {
                System.out.println(n2 + " is langer");
            }
        }
    }
}
