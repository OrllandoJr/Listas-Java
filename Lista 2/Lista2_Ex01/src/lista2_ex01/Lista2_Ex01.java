package lista2_ex01;

import java.util.Scanner;

public class Lista2_Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x;

        System.out.println("Digite um número:");
        x = in.nextDouble();

        if (x % 2 == 0) {
            System.out.print("O número " + x + " é PAR ");
        } else {
            System.out.print("O número " + x + " é IMPAR ");
        }
        
        if (x == 0){
            System.out.print(" e neutro.");
        }
        
        if (x>0){
            System.out.print("e POSITIVO.");
        }
        else {
            System.out.print("e NEGATIVO.");
        }
    }
}
