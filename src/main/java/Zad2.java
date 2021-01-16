import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        //pobierz od uzytkownika imie
        //jesli jest jednym z 4 "znanych" to przywitaj po imieniu
        //w przeciwnym razie powiedz "hejka naklejka"
        String imie;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        imie = scanner.nextLine();

        switch (imie){
            case "Jan":
                System.out.println("Czesc Janie!");
                break;
            case "Julia":
                System.out.println("Czesc Julio!");
                break;
            case "Jakub":
                System.out.println("Czesc Jakubie!");
                break;
            case "Anna":
                System.out.println("Czesc Anno!");
                break;
                
            default:
                System.out.println("Hejka Naklejka!");

        }
    }
}
