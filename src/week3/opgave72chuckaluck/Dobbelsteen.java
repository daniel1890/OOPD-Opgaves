package week3.opgave72chuckaluck;

import java.util.Random;

public class Dobbelsteen {
    int huidigGetal;
    int maximumBereik;

    public Dobbelsteen(int maximumBereik) {
        this.maximumBereik = maximumBereik;
    }

    public void werpDobbelsteen() {
        Random rand = new Random();
        int randomGetal = rand.nextInt(this.maximumBereik) + 1;
        this.huidigGetal = randomGetal;
    }

    public boolean isHuidigGetalGelijkAanGeluksGetal(int geluksGetal) {
        return this.huidigGetal == geluksGetal;
    }

    @Override
    public String toString() {
        return "Dobbelsteen{" +
                "huidigGetal=" + huidigGetal +
                ", maximumBereik=" + maximumBereik +
                '}';
    }
}
