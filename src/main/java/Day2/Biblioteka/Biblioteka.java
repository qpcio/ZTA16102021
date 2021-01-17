package Day2.Biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    public static void main(String[] args) {
        Ksiazka wp = new Ksiazka(123,"Wladca piercieni","J.R.R. Tolkien");
        Film av = new Film(234,"Batman","Nolan","Thriller");

        System.out.println(wp.toString());
        System.out.println(av);

      
    }
}
