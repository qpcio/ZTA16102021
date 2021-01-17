package Day2;

public class Szef extends Pracownik{
    int premia;

    public Szef(String imie, String nazwisko, int wiek, int premia) {
        super(imie, nazwisko, wiek);    // wywolanie konstruktora klasy nadrzednej
        this.premia = premia;
    }

    public void pobierzDane(){
        System.out.println(imie+" "+nazwisko+
                " lat: "+wiek+
                " premia: "+premia);
    }
}
