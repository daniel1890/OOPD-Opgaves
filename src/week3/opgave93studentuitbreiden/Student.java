package week3.opgave93studentuitbreiden;

import java.util.Objects;

public class Student {
    private String naam;
    private String geslacht;
    private int studentNummer;

    public static final String MAN = "man";
    public static final String VROUW = "vrouw";

    private static int nStudenten = 0;

    public Student(String naam) {
        this.naam = naam;
        this.studentNummer = nStudenten;
        nStudenten++;
    }

    public String getGeslacht() {
        return geslacht;
    }
    public void setGeslacht(String geslacht) {
        if(Objects.equals(geslacht, Student.MAN) || Objects.equals(geslacht, Student.VROUW)) {
            this.geslacht = geslacht;
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