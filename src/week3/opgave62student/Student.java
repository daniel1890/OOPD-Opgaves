package week3.opgave62student;

public class Student {
    private String naam;
    private int nummer;
    private String schoolNaam;

    public Student(String naam, int nummer, String schoolNaam) {
        this.naam = naam;
        this.nummer = nummer;
        this.schoolNaam = schoolNaam;
    }

    public String toString() {
        return "naam: " + this.naam + ", Studentnummer: " + this.nummer + ", school: " + this.schoolNaam;
    }
}
