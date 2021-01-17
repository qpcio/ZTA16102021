package Day2.Zwierzaki;

public class Podworze {
    public static void main(String[] args) {
        Zwierze zwierze = FabrykaZwierzat.getZwierze("Komar");

        System.out.println(zwierze.getClass().toString());
        System.out.println(zwierze.dajGlos());
    }
}
