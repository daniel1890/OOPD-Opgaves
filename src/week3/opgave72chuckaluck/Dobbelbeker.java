package week3.opgave72chuckaluck;

import java.util.Arrays;

public class Dobbelbeker {
    private Dobbelsteen[] dobbelstenen;

    public Dobbelbeker(int aantalDobbelstenen) {
        this.dobbelstenen = new Dobbelsteen[aantalDobbelstenen];
        for (int i = 0; i < aantalDobbelstenen; i++) {
            Dobbelsteen d = new Dobbelsteen(6);
            dobbelstenen[i] = d;
        }
    }

    public int aantalGetallenGelijkAanGeluksGetal(int geluksGetal) {
        int aantalKeerGeluksGetalGeworpen = 0;
        for (Dobbelsteen dobbelsteen : dobbelstenen) {
            dobbelsteen.werpDobbelsteen();
            if (dobbelsteen.isHuidigGetalGelijkAanGeluksGetal(geluksGetal)) {
                aantalKeerGeluksGetalGeworpen += 1;
            }
        }
        return aantalKeerGeluksGetalGeworpen;
    }

    @Override
    public String toString() {
        return "Dobbelbeker{" +
                "dobbelstenen=" + Arrays.toString(dobbelstenen) +
                '}';
    }
}
