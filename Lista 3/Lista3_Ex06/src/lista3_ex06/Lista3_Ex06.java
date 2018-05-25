package lista3_ex06;

import java.util.Scanner;

public class Lista3_Ex06 {

    public static void main(String[] args) {

        int marcador;

        Scanner in = new Scanner(System.in);
        marcador = 0;

        while (marcador == 0) {

            System.out.println("\nVocê digitará três valores reais em ordem crescente.");
            System.out.print("Digite o primero valor: ");
            float n1 = in.nextFloat();
            System.out.print("Digite o segundo valor: ");
            float n2 = in.nextFloat();
            System.out.print("Digite o terceiro valor: ");
            float n3 = in.nextFloat();

            if ((n1 < n2) && (n1 < n3) && (n2 < n3)) {

                float soma = n1 + n2 + n3;
                float produto = n1 * n2 * n3;
                float media = (n1 + n2 + n3) / 3;

                System.out.println("\nA soma dos valores é " + soma);
                System.out.println("O produto dos valores é " + produto);
                System.out.println("A média dos valores é " + media);
            } else {
                System.out.println("Não está em ordem crescente!");
                marcador = 1;
            }
        }
    }
}
