package example4;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CsvFileParser implements FileParser {

    private static final Logger LOGGER = Logger.getLogger(CsvFileParser.class.getName());

    @Override
    public void parse() {
        LOGGER.info("Parse CSV file");
    }
}
