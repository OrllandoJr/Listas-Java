package lista3_ex10;

import java.util.Scanner;

public class Lista3_Ex10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número e saiba os n primeiros nº primos:");
        int n = in.nextInt();

        int cont = 0;

        for (int i = 1; i <= 9999; i++) {
            
            int contador = 0;
            
            for (int x = 1; x <= 9999; x++) {
                if (i % x == 0) {
                    contador = contador + 1;
                }
            }

            if (contador == 2) {
                System.out.println("Os " + n + " primeiros números primos são: " + i);
                cont = cont + 1;

                if (cont == n) {
                    break;
                }
            }

        }

    }

}