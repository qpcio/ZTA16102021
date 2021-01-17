package Day2.Zwierzaki;

public class FabrykaZwierzat {
    public static Zwierze getZwierze(String nazwa){
        Zwierze zwierze;
        switch (nazwa){
            case "Komar":
                //return new Komar();   - mozna zwrcac komara i tu!
                zwierze = new Komar();
                break;
            case "Mysz":
                zwierze = new Mysz();
                break;
            case "Pies":
                zwierze = new Pies();
                break;
            default:
                zwierze = null; 
        }
        return zwierze;
    }
}
