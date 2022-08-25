import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o preço de fabrica do carro: ");
        double precoCarro = ler.nextDouble();
        System.out.println("Digite o percentual de imposto: ");
        double percentualImposto = ler.nextDouble();

        double valorImposto = (precoCarro / 100) * percentualImposto;
        double valorEntrega = (precoCarro / 100) * 2;
        double valorFinal = precoCarro + valorImposto + valorEntrega;

        System.out.println("O valor total de imposto é R$ " + valorImposto);
        System.out.println("O valor de entrega ate a concessionaria é R$ " + valorEntrega);
        System.out.println("O preço final do carro é R$ " + valorFinal);

    }
}
