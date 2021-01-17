import java.util.InputMismatchException;
import java.util.Scanner;

public class PiwoExc {
    /* pytaj o wiek do poki nie poda liczby
    jesli nie liczba - powiedz "ma byc liczba"
    jesli liczba i >=18 -> piwo
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj wiek");
            try {
                int wiek = scanner.nextInt();
                if (wiek >= 18) {
                    System.out.println("Piwo");
                    wiek = 18/0;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Miala byc liczba!!!!");
                scanner.nextLine();
            }
        }

    }

}

