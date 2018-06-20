package l2e2;

import java.util.Scanner;

public class Cliente {

    Scanner in = new Scanner(System.in);
    
    String nome, origem, destino, ida, volta;
    long cpf;
    float valor;

    public void dados() {
        System.out.print("Nome: ");
        String nomeCliente = in.next();
        this.nome = nomeCliente;
        System.out.print("CPF: ");
        long cpfCliente = in.nextLong();
        this.cpf = cpfCliente;
        System.out.print("Origem: ");
        String origemCliente = in.next();
        this.origem = origemCliente;
        System.out.print("Destino: ");
        String destinoCliente = in.next();
        this.destino = destinoCliente;
        System.out.print("Ida: ");
        ida = in.next();
        System.out.print("Volta: ");
        volta = in.next();
        System.out.print("Valor: ");
        float valorViagem = in.nextFloat();
        this.valor = valorViagem;
    }

    public void exibir() {

        System.out.println("Obrigado por escolher a nossa agência aérea");
        System.out.printf("Origem: %s   Destino: %s\n", origem, destino);
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.printf("Nome do passageiro: %s\n", nome);
        System.out.printf("CPF: %s\n", cpf);
        System.out.println("Data de ida:" + ida);
        System.out.println("Data de volta:" + volta);
        System.out.println("Desejamos que tenha um execelente voo!!!");

    }

}
