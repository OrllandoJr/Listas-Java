package l1e1;
import java.util.Scanner;
public class L1E1 {

    public static void main(String[] args) {

        double base = 550;
        int i = 1;
        double valor = 0;
        do {
            valor = valor + base;
            i++;
        } while (i <= 12);

        i = 1;

        base = base + (base * 0.1);
        do {
            valor = valor + base;
            i++;
        } while (i <= 12);

        i = 1;

        base = base + (base * 0.1);
        do {
            valor = valor + base;
            i++;
        } while (i <= 12);

        i = 1;

        base = base + (base * 0.1);
        do {
            valor = valor + base;
            i++;
        } while (i <= 12);

        System.out.printf("O valor total do aluguel para os 4 anos é %.2f\n",valor);
        
        System.out.print("Digite o valor do desconto:");
        Scanner in = new Scanner(System.in);
        double desconto = in.nextDouble();
        
        valor = valor-desconto;
        
        System.out.printf("O valor com desconto é %.2f\n",valor);
    
    }
}
