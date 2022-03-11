package week5.opgave133ifelsenaarinterface;

public class RechthoekGereedschap implements IGereedschap{
    @Override
    public void pasGereedschapToe(TekenApp app) {
        Rechthoek r = new Rechthoek( mouseX, mouseY, 50, 50);
        figurenLijst.add(r);
    }
}
