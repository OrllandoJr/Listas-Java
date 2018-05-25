package lista2_ex05;

import java.util.Scanner;

public class Lista2_Ex05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1, n2, n3, media, soma, mult;
        int opc;

        System.out.println("Digite o primeiro valor:");
        n1 = in.nextDouble();
        System.out.println("Digite o segundo valor:");
        n2 = in.nextDouble();
        System.out.println("Digite o terceiro valor:");
        n3 = in.nextDouble();

        System.out.println("\nEscolha uma opção.");
        System.out.println("1. Calcular a média.");
        System.out.println("2. Calcular a soma.");
        System.out.println("3. Calcular a multiplicação.");
        opc = in.nextInt();

        if (opc == 1) {
            media = (n1 + n2 + n3) / 3;
            System.out.println("A média é " + media);
        }

        if (opc == 2) {
            soma = n1 + n2 + n3;
            System.out.println("A soma é " + soma);
        }

        if (opc == 3) {
            mult = n1 * n2 * n3;
            System.out.println("A multiplicação é " + mult);
        }

    }

}
