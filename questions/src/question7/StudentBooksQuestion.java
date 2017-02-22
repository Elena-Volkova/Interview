package question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print all unique Java books that were read by students sorted by name. Use java 8 streams.
 */
public class StudentBooksQuestion {

    public static void main(String[] args) {
        List<Student> students = createStudents();

        //TODO Print all unique Java books that were read by students sorted by name. Use java 8 streams.
    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(Student.newBuilder()
                .withName("Student_1")
                .withBooks(Arrays.asList(
                        Book.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Introduction to Java")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Java How To Program")
                                .build()
                ))
                .build());

        students.add(Student.newBuilder()
                .withName("Student_2")
                .withBooks(Arrays.asList(
                        Book.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Some Famous book")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Java How To Program")
                                .build()
                ))
                .build());

        students.add(Student.newBuilder()
                .withName("Student_3")
                .withBooks(Arrays.asList(
                        Book.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Introduction to Java")
                                .build(),
                        Book.newBuilder()
                                .withBookName("Effective Java")
                                .build()
                ))
                .build());

        return students;
    }
}
