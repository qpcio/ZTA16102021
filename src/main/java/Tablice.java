import java.util.Scanner;

public class Tablice {
    /* Pobierz od uzytkownika 5 imion
    umiesc je w tablicy w kolejnych polach
    nastepnie wypisz wszystkie "Witaj xxx"
     */

    public static void main(String[] args) {
        int numberOfParticipants = 5;
        String imiona[] = new String[numberOfParticipants];
        Scanner scanner = new Scanner(System.in);

        //jak poprawic te petle nizej, zeby nie trzeba bylo
        // jej juz pozniej zmieniac, jak bedzie sie zmienial rozmiar tablicy?
        for (int i = 0; i < imiona.length; i++) {
            System.out.println("Podaj imie");
            imiona[i] = scanner.nextLine();
        }
        // o tak =>
        for (int i = 0; i < imiona.length; i++) {
            System.out.println("witaj " + imiona[i]);
        }
    }
}
