public class Tablice3 {
    /* stworz tablice trzykrotnosci liczb od 1 do 50
    wypisz ja petla foreach
     */
    public static void main(String[] args) {
        int[] tablica = new int[50];
        for (int i=0;i<tablica.length;i++){
            tablica[i]=(i+1)*3;
        }
        for (int i:
             tablica) {
            System.out.println(i);
        }
    }
}
