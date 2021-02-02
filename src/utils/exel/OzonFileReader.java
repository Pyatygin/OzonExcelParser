package utils.exel;

import entities.OzonData;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class OzonFileReader {

    private ArrayList<OzonData> list = new ArrayList();


    public OzonFileReader() throws IOException {

    }

    public ArrayList<OzonData> getList() {
        return list;
    }

    public void start() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("read.xls"));

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet sheet = workbook.getSheetAt(1);
        Iterator<Row> iterator = sheet.iterator();

        while (iterator.hasNext()){

            Row row = iterator.next();

            list.add(
                    new OzonData(
                            row.getCell(1).getStringCellValue(),
                            row.getCell(2).getStringCellValue(),
                            row.getCell(15).getStringCellValue(),
                            row.getCell(16).getStringCellValue(),
                            row.getCell(17).getStringCellValue()
                    )
            );
        }
    }


}
