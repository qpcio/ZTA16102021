import java.util.Scanner;

public class Pierwsza {
    //odpowiedzieli czy liczba uzytkownika jest pierwsza :)
    // liczba pierwsza to jest taka, ktorz dzieli sie TYLKO przez 1 i sama siebie
    // najmniejsza pierwsza to 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        boolean pierwsza = true;

        
        if (liczba < 2) {
            pierwsza = false;
        } else {
            for (int i = 2; i < liczba / 2; i++) {
                if (liczba % i == 0) {
                    pierwsza = false;
                    break;
                }
            }
        }
        if (pierwsza) {
            System.out.println("Jest pierwsza");
        } else {
            System.out.println("Nie jest pierwsza");
        }
    }
}
