import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = ler.nextDouble();
        System.out.println("Digite o valor de B");
        double B = ler.nextDouble();
        System.out.println("Digite o valor de C");
        double C = ler.nextDouble();

        double Resultado = (B*B - 4 * A * C);

        System.out.println("O resultado do calculo da formula é: " + Resultado);
    }
}
