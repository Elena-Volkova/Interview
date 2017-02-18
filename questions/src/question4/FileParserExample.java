package question4;

import java.util.Arrays;
import java.util.List;

public class FileParserExample {

    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.xml", "file2.csv", "file3.xlsx", "file4.XML");

        for (String fileName : files) {
            String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);;

            if (fileExtension.equals("xml")) {
                System.out.println("Parse XML file");
            } else if (fileExtension.equals("csv")) {
                System.out.println("Parse CSV file");
            } else {
                System.out.println("Parse EXCEL file");
            }
        }
    }
}
