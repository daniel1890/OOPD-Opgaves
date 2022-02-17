package week3.opgave94studentuitbreidenenum;

import java.util.Objects;

public class Student {
    private String naam;
    private String geslacht;
    private int studentNummer;

    public enum Geslacht { MAN, VROUW};
    private static int nStudenten = 0;

    public Student(String naam) {
        this.naam = naam;
        this.studentNummer = nStudenten;
        nStudenten++;
    }

    public String getGeslacht() {
        return geslacht;
    }
    public void setGeslacht(Geslacht geslacht) {
        switch (geslacht) {
            case MAN -> this.geslacht = "man";
            case VROUW -> this.geslacht = "vrouw";
        }
    }

    public static int getNStudenten() {
        return nStudenten;
    }

    public int getStudentNummer() {
        return this.studentNummer;
    }

    public String toString() {
        return getNaam();
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}