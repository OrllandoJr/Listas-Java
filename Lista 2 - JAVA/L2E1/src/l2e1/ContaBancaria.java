package l2e1;

import java.util.Scanner;

public class ContaBancaria {
    
    Scanner in = new Scanner(System.in);
    
    private float conta;
    
    public float saque(){
        float saque;
        System.out.print("Valor do Saque:");
        saque = in.nextFloat();
        if (saque > conta){
            System.out.println("Saldo Insuficiente!");
        }else {
            conta -= saque;
        }
        return conta;
    }
    public void deposito(){
        System.out.print("Valor de Deposito: ");
        float deposito = in.nextFloat();
        conta = deposito;
    }
    public void saldo(){
        System.out.printf("Seu saldo é R$ %.2f\n", conta);
    }
    
}
