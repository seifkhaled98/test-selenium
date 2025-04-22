package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excelread {
    public static String getCellData(String FilePath , String sheetname , int row , int col ) throws IOException {
        FileInputStream fis = new FileInputStream(new File(FilePath));
        Workbook workBook = new XSSFWorkbook(fis);
        Sheet sheet = workBook.getSheet(sheetname);
        Row sheetRow = sheet.getRow(row);
        Cell cell = sheetRow.getCell(col);
        String data = cell.getStringCellValue();
        workBook.close();
        fis.close();
        return data;

    }
}
