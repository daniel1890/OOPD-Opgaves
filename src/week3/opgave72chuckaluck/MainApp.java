package week3.opgave72chuckaluck;

public class MainApp {

    public static void main(String[] args) {
        Dobbelsteen d = new Dobbelsteen(6);

        // 5 tests voor de functionaliteit van de dobbelsteen
        d.werpDobbelsteen();
        boolean zijnGelijk = d.isHuidigGetalGelijkAanGeluksGetal(5);
        System.out.println(d.toString() + "getallen zijn gelijk: " + zijnGelijk);
        d.werpDobbelsteen();
        zijnGelijk = d.isHuidigGetalGelijkAanGeluksGetal(5);
        System.out.println(d.toString() + "getallen zijn gelijk: " + zijnGelijk);
        d.werpDobbelsteen();
        zijnGelijk = d.isHuidigGetalGelijkAanGeluksGetal(5);
        System.out.println(d.toString() + "getallen zijn gelijk: " + zijnGelijk);
        d.werpDobbelsteen();
        zijnGelijk = d.isHuidigGetalGelijkAanGeluksGetal(5);
        System.out.println(d.toString() + "getallen zijn gelijk: " + zijnGelijk);
        d.werpDobbelsteen();
        zijnGelijk = d.isHuidigGetalGelijkAanGeluksGetal(5);
        System.out.println(d.toString() + "getallen zijn gelijk: " + zijnGelijk);

        // tests voor de functionaliteit van de dobbelbeker
//        Dobbelbeker beker = new Dobbelbeker(3);
//        beker.aantalGetallenGelijkAanGeluksGetal(5);
//        System.out.println(beker.toString());
//        beker.aantalGetallenGelijkAanGeluksGetal(5);
//        System.out.println(beker.toString());
//        beker.aantalGetallenGelijkAanGeluksGetal(5);
//        System.out.println(beker.toString());
//        beker.aantalGetallenGelijkAanGeluksGetal(5);
//        System.out.println(beker.toString());
//        beker.aantalGetallenGelijkAanGeluksGetal(5);
//        System.out.println(beker.toString());

        // tests voor de functionaliteit van het chuckaluckspel
        ChuckALuck spel = new ChuckALuck(100);
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
        spel.speelRonde(5, 10);
        System.out.println(spel.toString());
    }


}
