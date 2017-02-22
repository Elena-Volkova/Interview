package example7;

import java.util.List;

public class Student {

    private String name;

    private List<Book> books;

    private Student(Builder builder) {
        name = builder.name;
        books = builder.books;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public static final class Builder {
        private String name;
        private List<Book> books;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withBooks(List<Book> val) {
            books = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
