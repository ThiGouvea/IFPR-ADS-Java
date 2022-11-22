import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int quantidade0_25 = 0;
        int quantidade26_50 = 0;
        int quantidade51_75 = 0;
        int quantidade76_100 = 0;
        int quantidade100 = 0;
        double numero = 0;

        while (true) {
            System.out.println("Digite um numero, ou um numero negativo para parar: ");
            numero = Ler.nextDouble();
            if (numero < 0) {break;
            } else if (numero > 0 && numero <= 25) { quantidade0_25++;
            } else if (numero > 25 && numero <= 50) { quantidade26_50++;
            } else if (numero > 50 && numero <= 75) { quantidade51_75++;
            } else if (numero > 75 && numero <= 100) { quantidade76_100++;
            } else { quantidade100++;
            }
        }
        System.out.println("numeros entre 0 e 25 = " + quantidade0_25);
        System.out.println("numeros entre 26 e 50 = " + quantidade26_50);
        System.out.println("numeros entre 51 e 75 = " + quantidade51_75);
        System.out.println("numeros entre 76 e 100 = " + quantidade76_100);
        System.out.println("numeros maiores que 100 = " + quantidade100);
    }
}
