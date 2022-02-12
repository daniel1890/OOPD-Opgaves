package week3.opgave62student;

public class Main {
    public static void main(String[] args) {
        School aim = new School("AIM");
        Student s1 = new Student("Hanneke", 1, aim.getNaam());
        Student s2 = new Student("Femke", 2, aim.getNaam());

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
