package week5.opgave133ifelsenaarinterface;

import java.util.ArrayList;

public class GumGereedschap implements IGereedschap{
    ArrayList<Figuur> figurenLijst;

    public GumGereedschap(ArrayList<Figuur> figurenLijst) {
        this.figurenLijst = figurenLijst;
    }
    @Override
    public void pasGereedschapToe(TekenApp app) {
        for (int i = figurenLijst.size() - 1; i >= 0; i--) {
            Figuur fig = figurenLijst.get(i);
            if (fig.isMuisBinnen(app.mouseX, app.mouseY, app)) {
                figurenLijst.remove(i);
            }
        }
    }
}
