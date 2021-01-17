package Day2.Biblioteka;

public class Film extends Publikacja {
    private String rezyser;
    private String gatunek;

    public Film(int isbn, String tytul, String rezyser, String gatunek) {
        super(isbn, tytul);
        this.rezyser = rezyser;
        this.gatunek = gatunek;
    }

    @Override
    public String toString() {
        return "Film{" +
                "rezyser='" + rezyser + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", isbn=" + isbn +
                ", tytul='" + tytul + '\'' +
                '}';
    }
}
