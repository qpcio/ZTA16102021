package Day2.Warzywniak;

public class Pomarancze extends Owoce {
    int promien;

    public Pomarancze(int waga, int cena, int promien) {
        super(waga, cena);
        this.promien = promien;
    }

    @Override
    public String toString() {
        return "Pomarancze{" +
                "promien=" + promien +
                ", waga=" + waga +
                ", cena=" + cena +
                '}';
    }
}
