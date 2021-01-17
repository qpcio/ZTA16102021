import java.util.InputMismatchException;
import java.util.Scanner;

public class Suma {
    /* program pobiera liczby od uzytkownika
    jest zabezpieczony przed nie-liczbami
    az do podania 0 = wtedy zwraca sume dotychczas podanych
     */

    public static void main(String[] args) {
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Podaj liczbe");
            try{
                int liczba = scanner.nextInt();
                if(liczba==0){
                    System.out.println("Suma to: "+suma);
                    break;
                }
                suma += liczba;
            }catch (InputMismatchException e){
                System.out.println("Miala byc liczba");
                scanner.nextLine();
            }
        }
    }
}
