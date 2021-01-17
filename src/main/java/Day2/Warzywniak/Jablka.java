package Day2.Warzywniak;

public class Jablka extends Owoce {
    public Jablka(int waga, int cena) {
        super(waga, cena);
    }

    @Override
    public String toString() {
        return "Jablka{" +
                "waga=" + waga +
                ", cena=" + cena +
                '}';
    }
}
