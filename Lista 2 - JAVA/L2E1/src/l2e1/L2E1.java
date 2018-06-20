package l2e1;

import java.util.Scanner;

public class L2E1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ContaBancaria op = new ContaBancaria();
        
        System.out.println("1.Deposito");
        System.out.println("2.Saque");
        System.out.println("3.Saldo");
        System.out.println("4.Sair");
        System.out.print("O que deseja fazer: ");
        
        int opcao = in.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    op.deposito();
                    break;
                case 2:
                    op.saque();
                    break;
                case 3:
                    op.saldo();
                    break;
                default:
                    break;
            }
            
            System.out.println("1.Deposito");
            System.out.println("2.Saque");
            System.out.println("3.Saldo");
            System.out.println("4.Sair");
            System.out.println("O que deseja fazer:");
            
            opcao = in.nextInt();
        }

    }

}
