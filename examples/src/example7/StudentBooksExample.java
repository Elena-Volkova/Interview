package example7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print all unique Java books that were read by students sorted by name. Use java 8 streams.
 */
public class StudentBooksExample {

    public static void main(String[] args) {
        List<Student> students = createStudents();

        students.stream()
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .filter(book -> book.getBookName().contains("Java"))
                .distinct()
                .sorted((book1, book2) -> book1.getBookName().compareTo(book2.getBookName()))
                .forEach(System.out::println);

    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(Student.newBuilder()
                .withName("Student_1")
                .withBooks(Arrays.asList(
                        Books.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Introduction to Java")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Java How To Program")
                                .build()
                ))
                .build());

        students.add(Student.newBuilder()
                .withName("Student_2")
                .withBooks(Arrays.asList(
                        Books.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Some Famous book")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Java How To Program")
                                .build()
                ))
                .build());

        students.add(Student.newBuilder()
                .withName("Student_3")
                .withBooks(Arrays.asList(
                        Books.newBuilder()
                                .withBookName("Thinking in Java")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Introduction to Java")
                                .build(),
                        Books.newBuilder()
                                .withBookName("Effective Java")
                                .build()
                ))
                .build());

        return students;
    }
}
