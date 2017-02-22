package question7;

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
}
