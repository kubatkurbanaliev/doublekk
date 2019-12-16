package runner;

import cucumber.api.java.it.Ma;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
public class ExcelTest {

    public static void main(String[] args) {

        File file = new File("src\\test\\resources\\data\\testData.xlsx");
        try {
            FileInputStream input = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(input);
            XSSFSheet excelSheet = workbook.getSheet("Sheet1");
            String value = excelSheet.getRow(0).getCell(0).toString();
            System.out.println(value);
            XSSFRow row = excelSheet.getRow(1);
            XSSFCell cell = row.getCell(2);
            System.out.println(cell);

            XSSFRow row2 = excelSheet.getRow(4);
            XSSFCell cell2 = row2.createCell(3);
            cell2.setCellType(CellType.STRING);
            cell2.setCellValue("Miami");

            FileOutputStream fileOutput = new FileOutputStream("src\\test\\resources\\data\\testData.xlsx");
            workbook.write(fileOutput);
        } catch (Exception e) {
            System.out.println("Excel file does not exist");
        }

    }

    public void m() {


    Map<String, Object> name = new HashMap<>();

        List<Map<String,Object>> listOfMaps = new ArrayList<>();

        Map<String, Object> data = new HashMap<>();
        data.put("id",1);
        data.put("first_name","George");

        listOfMaps.add(data);

    name.put("total",12);
    name.put("total_pages",1);
    name.put("data",listOfMaps);


}
}
