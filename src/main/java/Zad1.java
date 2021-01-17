import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        int a, b;
        //pobierz z konsoli dwie liczby
        //zwroc informacje o porownaniu liczb na konsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        // co zrobic z tym scanner.nextInt() ??
        a = scanner.nextInt();

        System.out.println("Podaj liczbe b");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("a jest wieksze niz b");
        } else if (a < b) {
            System.out.println("b jest wieksze niz a");
        } else {
            System.out.println("Liczby sa sobie rowne");
        }

    }
}
