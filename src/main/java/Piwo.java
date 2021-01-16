import java.util.Scanner;

public class Piwo {
    //pobierz od uzytkownika wiek
    //jesli ma wieciej niz lub rowno 18 lat wypisz
    // "piwo"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        if(scanner.nextInt()>=18) System.out.println("Piwo");
    }
}
