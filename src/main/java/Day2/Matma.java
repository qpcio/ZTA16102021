package Day2;

public class Matma {

    boolean isPrime(int liczba) {
        if (liczba < 2) {
            return false;
        } else {
            for (int i = 2; i <= liczba / 2; i++) {
                if (liczba % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    // Zeby ponizsze dzialalo, to isPrime musi byc static
//    public static void main(String[] args) {
//        System.out.println(isPrime(4));
//    }

    // Dodajcie trzy metody mnozenie 2, 3, 4 inty
    // zwracaja wynik mnozenia argumentow ->

    public int mnozenie(int x, int y) {
        return x * y;
    }

    public int mnozenie(int x, int y, int z) {
        return x * y * z;
    }

    public int mnozenie(int x, int y, int z, int a) {
        return x * y * z * a;
    }

    public Matma (){
        
    }
}
