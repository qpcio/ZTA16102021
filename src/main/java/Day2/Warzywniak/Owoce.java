package Day2.Warzywniak;

public abstract class Owoce {
    // waga i cena
    //pobierz wage i cene
    // rozszerzamy przez trzy klasy -> banany, jablka, pomarancze
    // w klasie Warzywniak uzycie
    int waga, cena;

    public Owoce(int waga, int cena) {
        this.waga = waga;
        this.cena = cena;
    }

    public int getWaga() {
        return waga;
    }

    public int getCena() {
        return cena;
    }
}
