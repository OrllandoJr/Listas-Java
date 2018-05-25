package lista2_ex02;

import java.util.Scanner;

public class Lista2_Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double L1, L2, L3;

        System.out.println("Digite o primeiro lado do triângulo:");
        L1 = in.nextDouble();
        System.out.println("Digite o segundo lado do triângulo:");
        L2 = in.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo:");
        L3 = in.nextDouble();

        if ((L1 + L2 < L3) || (L1 + L3 < L2) || (L2 + L3 < L1)) {
            System.out.println("Os lados fornecidos não formam um triângulo!");
            }
        else{
        
        if ((L1==L2)&&(L2==L3)){
            System.out.println("O triângulo é EQUILATERO!");
        }
        
        if ((L1!=L2)&&(L1!=L3)&&(L2!=L3)){
            System.out.println("O triângulo é ESCALENO!");
        }
        
        if (((L1==L2)&&(L1!=L3)) || ((L1==L3)&&(L1!=L2))){
            System.out.println("O triângulo é ISÓSCELES");
        }
        }
    }
}
