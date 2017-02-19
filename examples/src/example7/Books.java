package example7;

import java.time.LocalDate;
import java.util.Objects;

public class Books {

    private String bookName;

    private Books(Builder builder) {
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

        public Books build() {
            return new Books(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(bookName, books.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
