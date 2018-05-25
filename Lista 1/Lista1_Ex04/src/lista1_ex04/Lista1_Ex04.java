package lista1_ex04;

import java.util.Scanner;

public class Lista1_Ex04 {

  
  public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    
    int A, B, X;
    
    System.out.println("Digite um valor para A:");
      A = in.nextInt();
    System.out.println("Digite um valor para B:");
       B = in.nextInt();
    
    X = A;
    A = B;
    B = X;
        
    System.out.println("Trocando os valores");
    System.out.println("\n'A' passa a ser "+A);
    System.out.println("'B' passa a ser "+B);
  }
}
