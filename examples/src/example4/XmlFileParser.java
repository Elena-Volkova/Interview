package example4;

import java.util.logging.Logger;

public class XmlFileParser implements FileParser {

    private static final Logger LOGGER = Logger.getLogger(CsvFileParser.class.getName());

    @Override
    public void parse() {
        LOGGER.info("Parse XML file");
    }
}
