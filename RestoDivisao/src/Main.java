import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int t = 0;

        t = Ler.nextInt();
        Ler.nextLine();

        String[] opcao = Ler.nextLine().toLowerCase().split(" ");

        System.out.println(opcao[1]);
    }
}
