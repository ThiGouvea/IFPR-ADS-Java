import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno");
        String nome = ler.next();
        System.out.println("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("%s, sua média é %.2f", nome, media);

    }
}
