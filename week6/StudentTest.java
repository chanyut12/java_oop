package week6;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("chanyut", "lisawat", 70, 74, 99);
        System.out.println("The average score of chanyut is: " + student.getAverage());
    }
}
