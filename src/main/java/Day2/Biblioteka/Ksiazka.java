package Day2.Biblioteka;

public class Ksiazka extends Publikacja{
    private String autor;

    public Ksiazka(int isbn, String tytul, String autor) {
        super(isbn,tytul);
        this.autor = autor;
    }


    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", Autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
