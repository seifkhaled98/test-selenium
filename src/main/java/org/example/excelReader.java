package org.example;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class excelReader {
    public static String getCellData(String filePath, String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row sheetRow = sheet.getRow(row);
        Cell cell = sheetRow.getCell(col);
        String data = cell.getStringCellValue();
        workbook.close();
        fis.close();
        return data;
    }

}
