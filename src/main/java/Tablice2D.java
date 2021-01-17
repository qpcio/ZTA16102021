public class Tablice2D {
    /* Przy użyciu pętli i tablic przechowujących liczby całkowite zaprezentuj poniższą treść:
tab[0,0] = 0;
tab[0,1] = 1;
tab[0,2] = 2;
tab[1,0] = 3;
tab[1,1] = 4;
tab[1,2] = 5;
     */
    public static void main(String[] args) {
        int[][] tablica = new int[2][3];
        int indexGlowny = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j] = indexGlowny;
                indexGlowny++;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("tab[" + i + "][" + j + "] = " + tablica[i][j]);
            }
        }
    }
}
