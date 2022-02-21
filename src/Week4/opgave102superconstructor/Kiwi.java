package Week4.opgave102superconstructor;

public class Kiwi extends Dier {
    private int loopSnelheid;

    public Kiwi(String naam, int loopSnelheid) {
        super(naam);
        this.loopSnelheid = loopSnelheid;
    }
}