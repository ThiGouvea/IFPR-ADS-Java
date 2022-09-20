package aula2009;

public class Switch {
    public static void main(String[] args) {
        int x = 0;
        switch (x) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            default:
                System.out.println("extra");
                break;
        }
    }
}
