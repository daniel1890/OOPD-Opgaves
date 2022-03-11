package week5.opgave133ifelsenaarinterface;

import java.util.ArrayList;

public class RechthoekGereedschap implements IGereedschap{
    ArrayList<Figuur> figurenLijst;

    public RechthoekGereedschap(ArrayList<Figuur> figurenLijst) {
        this.figurenLijst = figurenLijst;
    }
    @Override
    public void pasGereedschapToe(TekenApp app) {
        Rechthoek r = new Rechthoek( app.mouseX, app.mouseY, 50, 50);
        figurenLijst.add(r);
    }
}
