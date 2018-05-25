import java.util.Scanner;
import java.lang.Math;

public class lista1_ex03 {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
    
    double volume, altura, raio;
    
    System.out.println("Digite a altura da lata:");
      altura = in.nextDouble();
    System.out.println("Digite o raio da lata:");
	  raio = in.nextDouble();
    
    volume=Math.PI*Math.pow(raio,2)*altura;
    
    System.out.printf("O volume da lata é %.2f",volume,"cm³");
  }
}

