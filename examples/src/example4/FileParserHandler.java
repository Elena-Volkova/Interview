package example4;

import java.util.HashMap;
import java.util.Map;

public class FileParserHandler {

    private final Map<FileType, FileParser> fileParserFactory = new HashMap<>();

    public FileParserHandler() {
        fileParserFactory.put(FileType.CSV, new CsvFileParser());
        fileParserFactory.put(FileType.XML, new XmlFileParser());
        fileParserFactory.put(FileType.EXCEL, new ExcelFileParser());
    }

    public void parse(String fileName) {
        String fileExtension = getFileExtension(fileName);

        FileType fileType = FileType.getFileType(fileExtension);
        if (fileType != null) {
            FileParser fileParser = fileParserFactory.get(fileType);
            fileParser.parse();
        } else {
            throw new UnsupportedOperationException("File type not supported");
        }
    }

    private String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
