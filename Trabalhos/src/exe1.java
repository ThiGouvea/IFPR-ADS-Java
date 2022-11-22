import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite um numero para saber a tabuada do mesmo: ");
        int numero = Ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }
    }
}
