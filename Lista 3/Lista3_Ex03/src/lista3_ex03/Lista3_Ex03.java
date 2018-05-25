package lista3_ex03;

public class Lista3_Ex03 {

    public static void main(String[] args) {
        int a, b;
        double soma, x;

        b = 1;
        soma = 0;

        for (a = 1; a < 51; a++) {
            x = (b / a);
            soma = soma + x;
            b = b + 2;
        }

        System.out.println("O resultado da soma de (1/1)+(3/2)+(5/3)+...+(99/50) é " + soma);
    }

}
