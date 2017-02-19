package question7;

import java.util.List;

public class Student {

    private String name;

    private List<Books> books;

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

    public List<Books> getBooks() {
        return books;
    }

    public static final class Builder {
        private String name;
        private List<Books> books;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withBooks(List<Books> val) {
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
