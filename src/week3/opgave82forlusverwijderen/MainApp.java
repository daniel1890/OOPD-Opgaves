package week3.opgave82forlusverwijderen;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            lijst.add("element: " + i);
            System.out.println(lijst.get(i));
        }

        for (int i = lijst.size() - 1; i >= 0; i--) {     // regel 8
            String s = lijst.get(i);
            System.out.println(lijst.get(i));
            lijst.remove(s);
        }                                                         // regel 11
    }
}
