package week5.opgave133ifelsenaarinterface;

import java.util.ArrayList;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class TekenApp extends PApplet {

    public static void main(String[] args) {
        PApplet.main("week5.opgave133ifelsenaarinterface.TekenApp");
    }

    private ArrayList<Figuur> figurenLijst = new ArrayList<>();
    private IGereedschap cirkelGereedschap = new CirkelGereedschap(figurenLijst);
    private IGereedschap rechthoekGereedschap = new RechthoekGereedschap(figurenLijst);
    private IGereedschap selecteerGereedschap = new SelecteerGereedschap();
    private IGereedschap gumGereedschap = new GumGereedschap(figurenLijst);
    private IGereedschap huidigGereedschap = selecteerGereedschap;

    public void settings() {
        size(400, 400);
    }

    public void draw() {
        background(0);
        for (Figuur figuur : figurenLijst) {
            figuur.teken(this);
        }
    }

    public void mousePressed() {
        huidigGereedschap.pasGereedschapToe(this);
    }

    public void keyReleased() {
        switch (key) {
            case 's' -> huidigGereedschap = selecteerGereedschap;
            case 'r' -> huidigGereedschap = rechthoekGereedschap;
            case 'c' -> huidigGereedschap = cirkelGereedschap;
            case 'g' -> huidigGereedschap = gumGereedschap;
        }
    }
}