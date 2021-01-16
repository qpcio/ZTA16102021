import java.util.Scanner;

public class Bomba {
    //pobierz od uzytkownika liczbe
    // przy uzyciu 3 roznych petli
    //odlicz od liczby uzytkownika do 0 ("Bomba wybuchnie za x")
    //napisz BUM
    public static void main(String[] args) {
        int licznik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        licznik = scanner.nextInt();


       //FOR
        for (int i = licznik; i > 0 ; i--) {
            System.out.println("Bomba wybuchnie za "+i);
        }
        System.out.println("BUM!");

        //WHILE
        int j = licznik;
        while(j>0){
            System.out.println("Bomba wybuchnie za "+j);
            j--;
        }
        System.out.println("BUM!");

        //DO...WHILE
        j = licznik;
        do{
            System.out.println("Bomba wybuchnie za "+j);
            j--;
        }while(j>0);
        System.out.println("BUM!");
    }
}
