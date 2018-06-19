package l1e2;

import java.util.Scanner;

public class L1E2 {

    public static void main(String[] args) {
        float distancia = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Digite a distância em Km:");
            distancia = in.nextFloat();
            if (distancia > 12) {
                System.out.println("A distância deve ser menor que 12Km!");
            }
        } while (distancia > 12);

        float t = distancia / 20;
        
        t = t*60;

        System.out.printf("O tempo que a onda leva para chegar é %.0f minutos\n",t);
    }
}
