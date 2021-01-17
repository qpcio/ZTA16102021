package Day2;

public class Firma {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jam","Kowalski",44);
        Pracownik pracownik2 = new Pracownik("Jacek","Sasin",70000000);

//        pracownik1.imie = "Jan";
//        pracownik1.nazwisko = "Kowalski";
//        pracownik1.wiek = 44;
//        uzywajac seterow
//        pracownik1.setImie("Jan");
//        pracownik1.setNazwisko("Kowalski");
//        pracownik1.setWiek(44);


/*        pracownik2.imie = "Jacek";
        pracownik2.nazwisko = "Sasin";
        pracownik2.wiek = 70000000;*/
//        pracownik2.setImie("Jacek");
//        pracownik2.setNazwisko("Sasin");
//        pracownik2.setWiek(70000000);

        System.out.println("W twojej firmie pracuja:");
//        System.out.println(pracownik1.imie+" "+
//                pracownik1.nazwisko+" lat: "+
//                pracownik1.wiek);
//        System.out.println(pracownik2.imie+" "+
//                pracownik2.nazwisko+" lat: "+
//                pracownik2.wiek);
        pracownik1.pobierzDane();
        pracownik2.pobierzDane();


        Szef szef = new Szef("Jarek","Nieten",66,200);
        szef.pobierzDane();
    }
}
