package week3.opgave71klok;

import processing.core.PApplet;

public class MainApp extends PApplet {
    private Klok klok;

    public static void main(String[] args){
        PApplet.main(new String[]{"week3.opgave71klok.MainApp" });
    }

    public void settings() {
        size(400,300);
    }

     public void setup(){
        background(255);

        klok = new Klok(this,150, 100, 100);
    }

    public void draw(){
        klok.tik();
        klok.tekenKlok();
    }
}
