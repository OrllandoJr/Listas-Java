package lista3_ex02;

public class Lista3_Ex02 {

    public static void main(String[] args) {

        int n, cont, x;

        for (cont = 0; cont < 10; cont++) {
            for (n = 0; n < 10; n++) {
                x = cont*n;
                System.out.println(cont+" x "+n+" = "+x);
            }
        }
    }
}
