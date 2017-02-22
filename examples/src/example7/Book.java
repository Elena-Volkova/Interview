package example7;

import java.util.Objects;

public class Book {

    private String bookName;

    private Book(Builder builder) {
        bookName = builder.bookName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBookName() {
        return bookName;
    }

    public static final class Builder {
        private String bookName;

        private Builder() {
        }

        public Builder withBookName(String val) {
            bookName = val;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
