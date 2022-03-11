package Week4.opgave112asiel2;

public class MainApp {

    public static void main(String[] args) {
        Dier dier1 = new Dier();                                // regel 3
        Dier dier2 = new Zoogdier();
        Dier dier3 = new Hond();
        Zoogdier zoogdier2 = new Zoogdier();
        Zoogdier zoogdier3 = new Hond();
        Hond hond3 = new Hond();                       // regel 11

        System.out.println(dier1.toString());            // regel 13
        System.out.println(dier2.toString());
        System.out.println(dier3.toString());
        System.out.println(zoogdier2.toString());
        System.out.println(zoogdier3.toString());
        System.out.println(hond3.toString());        // regel 21
    }
}

class Dier{

    @Override
    public String toString() {
        return "Dier";
    }
}

class Zoogdier extends Dier {

    @Override
    public String toString() {
        return "Zoogdier";
    }
}

class Hond extends Zoogdier {

    @Override
    public String toString() {
        return "Hond";
    }
}
