import java.util.ArrayList;
import java.util.List;

public class Listy {
    //stworzcie liste, w ktorej bedzie 100 intow
    //nieparzyste - normalnie zgodnie z indexem
    //parzyste - podwojone
    public static void main(String[] args) {
//        List<String> lista = new ArrayList<>();
//        lista.add("Pierwszy!");

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                lista.add(i * 2);
            } else {
                lista.add(i);
            }
        }
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

        for (Integer i : lista) {
            System.out.println(i);
        }

    }
}
