import java.util.Scanner;

public class Zad3 {
    //jablka, banany, pomarancze (100kg miejsca na kazde)
    //uzytkownik podaje nazwe owocu i liczbe kg
    //program ma wypisac "xxx jest za duzo o Y kg"
    //"xxx jest w sam raz"
    //"mamy jeszcze Y kg miejsca na xxx"
    // lub "nieobslugiwany produkt"
    public static void main(String[] args) {
        String nazwa;
        int masa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe owocu");
        nazwa = scanner.nextLine();
        System.out.println("Podaj mase w kg");
        masa = scanner.nextInt();
//        Podpowiedz:
//        System.out.println("Owocow jest "+masa+" kilogramow");
        if (masa > 0) {
            switch (nazwa) {
                case "jablko":
                    if (masa > 100) {
                        System.out.println("Za duza ilosc jablek o " + (masa - 100) + " kg");
                    } else if (masa == 100){
                        System.out.println("Jablek jest w sam raz");
                    } else {
                        System.out.println("Mamy jeszcze "+(100-masa)+" kg miejsca na jablka");
                    }
                    break;
                default:
                    System.out.println("Nieoblugiwany produkt");
            }
        }else {
            System.out.println("Jak mamy miec <=0 owocow?!");
        }

    }
}
