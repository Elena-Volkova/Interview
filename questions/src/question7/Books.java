package question7;

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
}
