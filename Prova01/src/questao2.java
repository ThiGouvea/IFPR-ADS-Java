import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano em que voce nasceu: ");
        int anoNascimento = ler.nextInt();
        int idade = 2022 - anoNascimento;
        int quantidadeDias = idade * 365;

        System.out.println("A quantidade de dias vividos é: " + quantidadeDias);


    }
}
