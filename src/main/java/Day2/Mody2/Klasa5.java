package Day2.Mody2;

import Day2.Mody1.Klasa1;
import Day2.Mody1.Klasa2;

public class Klasa5 {
    private Klasa1 klasa1;       // <- to jest kompozycja

    public void test(){
        klasa1 = new Klasa1();

        klasa1.publiczny = 1 ;
        //zaden inny tu nie zadziala - brak dziedziczenie i inny pakiet
    }
}
