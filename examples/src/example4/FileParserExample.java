package example4;

import java.util.Arrays;
import java.util.List;

public class FileParserExample {

    private static final FileParserHandler fileParserHandler = new FileParserHandler();

    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.xml", "file2.csv", "file3.xlsx", "file4.XML");
        files.forEach(fileParserHandler::parse);
    }
}
