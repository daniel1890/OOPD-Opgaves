package week5.opgave133ifelsenaarinterface;

import java.util.ArrayList;

public class CirkelGereedschap implements IGereedschap{
    ArrayList<Figuur> figurenLijst;

    public CirkelGereedschap(ArrayList<Figuur> figurenLijst) {
        this.figurenLijst = figurenLijst;
    }
    @Override
    public void pasGereedschapToe(TekenApp app) {
        Cirkel c = new Cirkel(app.mouseX, app.mouseY, 50);
        figurenLijst.add(c);
    }
}
