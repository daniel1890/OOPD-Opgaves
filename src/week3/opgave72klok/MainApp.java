package week3.opgave72klok;

import processing.core.PApplet;

public class MainApp extends PApplet {
    Klok klok;

    public static void main(String[] args){
        PApplet.main(new String[]{"week3.opgave72klok.MainApp" });
    }

    public void settings() {
        size(400,300);
    }

     public void setup(){
        background(255);

        klok = new Klok(this,150, 100, 100);
        klok.setTijd(22, 58);
        klok.tik();
        klok.tik();
        klok.tekenKlok();
    }

    public void draw(){
        klok.tik();
        klok.tekenKlok();
    }
}
