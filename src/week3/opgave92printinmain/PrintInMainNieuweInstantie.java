package week3.opgave92printinmain;

public class PrintInMainNieuweInstantie {
    public static void main(String[] args) {
        PrintInMainNieuweInstantie fix = new PrintInMainNieuweInstantie();
        fix.print("hallo wereld");
    }

    public void print(String tekst) {
        System.out.println(tekst);
    }
}
