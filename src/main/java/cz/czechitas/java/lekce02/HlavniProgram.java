package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();


        //Nakresli domeček

        /*
        NakresliDomecek();

        PresunKDalsimu();

        NakresliDomecek();

        PresunKDalsimu();

        NakresliDomecek();
        */




        // Nakresli prase

        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(120);
            zofka.move(100);
        }

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(30);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(200);
        zofka.turnLeft(120);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(30);











        // nakresliCtverec(); vytvořená metoda viz níže

        //TODO tady bude kód
    }

    private void PresunKDalsimu() {
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void NakresliDomecek() {
        zofka.turnRight(30);
        zofka.move(100);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(100);
        }
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(90);
            zofka.move(100);

        }
    }


    //jak vytvořím metodu ozačit kod refactor  exctrakt metod
    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);   //zofka nakreslí čtverec

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}



// psvm + tabulátor vypíše automaticky  public static void main(String[] args) {}
// var - používá se místo typu (String, int, boolean). Vyhodnocuje se na základě hodnoty, která je přiřazená do proměnné. Když napíšu var text="Ahoj", bude var~String
// import třídy  alt enter (například new Random)
// fori a zmáčku tabulátor a vypíše ce mi cyklus
//sout + tab vypíše System.out.println();




