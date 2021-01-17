package Day2.Warzywniak;

public class Banany extends Owoce {
    int promienKrzywizny;

    public Banany(int waga, int cena, int promienKrzywizny) {
        super(waga, cena);
        this.promienKrzywizny = promienKrzywizny;
    }

    @Override
    public String toString() {
        return "Banany{" +
                "promienKrzywizny=" + promienKrzywizny +
                ", waga=" + waga +
                ", cena=" + cena +
                '}';
    }
}
