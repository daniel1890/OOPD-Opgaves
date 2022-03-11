package week5.opgave133ifelsenaarinterface;

public class SelecteerGereedschap implements IGereedschap {

    public SelecteerGereedschap(){
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        System.out.println("s");
    }
}
