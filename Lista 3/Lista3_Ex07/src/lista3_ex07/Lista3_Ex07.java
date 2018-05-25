package lista3_ex07;

import java.util.Scanner;

public class Lista3_Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float media = 0;
        float maior = 0;
        float menor = 99999;

        System.out.println("Quantas médias irá digitar?");
        int x = in.nextInt();

        for (int i = 1; i <= x; i++) {

            System.out.println("Digite a " + i + "ª média: ");
            float n = in.nextFloat();

            if (n < 0) {
                System.out.println("Média Invalida!");
                break;
            }

            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }

            media = media + n;
          
        }
        
        media = media/x;
                
        System.out.println("A maior nota é "+maior);
        System.out.println("A menor nota é "+menor);
        System.out.println("A média das notas é "+media);
    }
}
