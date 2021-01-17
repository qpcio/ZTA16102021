package Day2;

public class Pracownik {
    /*Napisz klasę Pracownik, która przechowuje trzy pola:
- Imię
- Nazwisko
- Wiek
Następnie utwórz klasę Firma,
w której wykorzystasz klasę pracownik do
utworzenia dwóch obiektów przechowujących dane pracowników
 (wymyśl sobie jakieś)i później wyświetlasz je na ekran.

 gettery do wszystkich pol
 pobierzDane -> wypisujemy na konsoli
*/
    String imie;
    String nazwisko;
    int wiek;

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane(){
        System.out.println(imie+" "+nazwisko+
                " lat: "+wiek);
    }

    // Dodac konstruktor inizjalizujacy wszystkie pola
    public Pracownik(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }



}
