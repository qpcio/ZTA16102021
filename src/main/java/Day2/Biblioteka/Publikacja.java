package Day2.Biblioteka;

public class Publikacja {
    //dodajcie pola i (metody?)
    // dwie klasy dziedziczace
    // 3 klasy sa elementami aplikacji do obslugi biblioteki :)
    int isbn;
    String tytul;

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }



    public Publikacja(int isbn, String tytul) {
        this.isbn = isbn;
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        return "Publikacja{" +
                "isbn=" + isbn +
                ", tytul='" + tytul + '\'' +
                '}';
    }
}
