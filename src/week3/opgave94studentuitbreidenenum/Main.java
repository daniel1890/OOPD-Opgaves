package week3.opgave94studentuitbreidenenum;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("han");
        System.out.println(s1.getNaam());
        System.out.println(s1.getStudentNummer());

        s1.setGeslacht(Student.Geslacht.MAN);
        System.out.println(s1.getGeslacht());

        Student s2 = new Student("aim");
        System.out.println(s2.getNaam());
        System.out.println(s2.getStudentNummer());
    }
}
