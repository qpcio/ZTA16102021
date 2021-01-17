public class Except {
    public static void main(String[] args) {
        try {
            //tu wyjatek
            //int a = 2/0;
            System.out.println("AAA");
        } catch (Exception e) {
            System.out.println("BBB");
        } finally {
            System.out.println("CCC");
        }
    }
}
