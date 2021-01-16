import java.util.Scanner;

public class Tablice2 {
    /* pobierz n od uzytkownika
    stworz tablice n-elementowa
    wypelnij ja dwu-krotnosciami indeksu :)
    wypisz liczby z tablicy
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow tablicy");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i]=2*i;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

    }
}
