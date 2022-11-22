import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero;
        double somatoriaNegativos = 0;
        double somatoriaPositivos = 0;
        int quantidadeNumeros = 0;
        double mediaPositivos;
        double mediaNegativos;

        while (true) {
            System.out.println("Digite um valor positivo ou negativo para fazer a media de ambos e zero para parar:");
            numero = Ler.nextInt();
            if (numero == 0) {
                break;
            } else if (numero < 0) {
                somatoriaNegativos += numero;
                quantidadeNumeros++;
            } else if (numero > 0) {
                somatoriaPositivos += numero;
                quantidadeNumeros++;

            }
        }

        mediaPositivos = somatoriaPositivos / quantidadeNumeros;
        mediaNegativos = somatoriaNegativos / quantidadeNumeros;

        System.out.println("Media numeros positivos = " + mediaPositivos);
        System.out.println("Media numeros negativos = " + mediaNegativos);

    }
}
