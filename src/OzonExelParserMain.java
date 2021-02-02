import utils.OzonFileReader;
import utils.OzonFileWriter;

import java.io.IOException;

public class OzonExelParserMain {
    public static void main(String[] args) throws IOException {

        OzonFileReader ozonFileReader = new OzonFileReader();
        ozonFileReader.start();

        OzonFileWriter ozonFileWriter = new OzonFileWriter();
        ozonFileWriter.start(ozonFileReader.getList());
    }
}
