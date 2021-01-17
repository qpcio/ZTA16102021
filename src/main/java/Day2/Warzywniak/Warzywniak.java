package Day2.Warzywniak;

import java.util.ArrayList;
import java.util.List;

public class Warzywniak {

    public static void main(String[] args) {
        Jablka jablka = new Jablka(2, 6);
        Pomarancze pomarancze = new Pomarancze(4, 12, 15);
        Banany banany = new Banany(4, 13, 45);

        banany.getCena();     // babany korzystaja z metody klasy nadrzednej

        //ponizsze nie dziala, bo klasa jest abstrakcyjna
        //Owoce owoce = new Owoce(2,5);
//        System.out.println(jablka);
//        System.out.println(pomarancze);
//        System.out.println(banany);

        //ponizej przyklad polimorfizmu
        List<Owoce> koszyk = new ArrayList<>();
        koszyk.add(jablka);
        koszyk.add(pomarancze);
        koszyk.add(banany);

        for (Owoce o : koszyk) {
            System.out.println(o);
        }

    }
}
