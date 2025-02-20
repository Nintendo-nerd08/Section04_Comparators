import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var reverseGrade = new GradeComparator().reversed();
        var age = new AgeComparator();


        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 10, 15));
        students.add(new Student("Jake", 11, 16));
        students.add(new Student("Charlie", 9, 14));

        students.sort(reverseGrade.thenComparing(age));
        System.out.println(students);


    }
}