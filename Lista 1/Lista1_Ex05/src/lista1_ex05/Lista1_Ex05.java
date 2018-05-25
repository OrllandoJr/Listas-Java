package lista1_ex05;

import java.util.Scanner;
import java.lang.Math;

public class Lista1_Ex05 {

  public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    
    int A;
    double X;
    
    System.out.println("Digite um número inteiro:");
      A = in.nextInt();
    
    X = Math.pow(A, 2);
        
    System.out.println("O quadrado de "+A+" é "+X);
    
  }
}
