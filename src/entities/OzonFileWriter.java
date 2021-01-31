package entities;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.ArrayList;

public class OzonFileWriter {

    private ArrayList<OzonData> list = new ArrayList();

    public void start(ArrayList<OzonData> list) throws FileNotFoundException {
        this.list = list;

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Книга 1");

        for (int i = 0; i < list.size(); i++) {
            Row row = sheet.createRow(i);

            Cell cellArticul = row.createCell(0);
            cellArticul.setCellValue(list.get(i).getArticul());

            Cell cellName = row.createCell(1);
            cellName.setCellValue(list.get(i).getName());

            Cell cellSellPrice = row.createCell(3);
            cellSellPrice.setCellValue(list.get(i).getSellPrice());

            Cell cellPrice = row.createCell(4);
            cellPrice.setCellValue(list.get(i).getPrice());

            Cell cellPricePremium = row.createCell(5);
            cellPricePremium.setCellValue(list.get(i).getPricePremium());
        }

        try {
            FileOutputStream outFile = new FileOutputStream("write.xls");
            workbook.write(outFile);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
