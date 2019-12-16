package utilities;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtils {

    //WorkBook
    //Sheet
    //Row
    //Cell
    //filePath

    //openExcelFile(String path, String sheetName) --> void
    //getValue(int rowNum, int cellNum) --> return String
    //setValue(String value, int rowNum, int cellNum) -> void
    //getNumberOfRows() -> return int

    private static XSSFWorkbook workbook;
    private static XSSFSheet excelSheet;
    private static XSSFRow row;
    private static XSSFCell cell;
    private static String filePath = "src\\test\\resources\\data\\testData.xlsx";

    /**
     * This method will open excel file
     * @param excelFileName
     * @param sheetName
     */
    public static void openExcelFile(String excelFileName, String sheetName){
        filePath="src\\test\\resources\\data\\"+excelFileName+".xlsx";
        try{
            File file = new File(filePath);
            FileInputStream input = new FileInputStream(file);
            workbook = new XSSFWorkbook(input);
            excelSheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            System.out.println("No such file in directory");
        }
    }

    /**
     * This method will accept rowNum and cellNum and will return the value of that cell
     * @param rowNum
     * @param cellNum
     * @return
     */
    public static String getValue(int rowNum, int cellNum){
        row = excelSheet.getRow(rowNum);
        cell = row.getCell(cellNum);
        return cell.toString();
    }

    public static void setValue(String value, int rowNum, int cellNum) throws IOException {
        row = excelSheet.getRow(rowNum);
        cell = row.getCell(cellNum);
        if(cell==null){
            cell = row.createCell(cellNum);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(value);
        }else {
            cell.setCellValue(value);
        }

        FileOutputStream output=null;

        try {
            output = new FileOutputStream(filePath);
            workbook.write(output);
        } catch (FileNotFoundException e) {
            System.out.println("No such file in directory");
        }finally {
            output.close();
        }
    }

    /**
     * Method will return the of rows in excel file
     * @return
     */
    public static int getNumberOfRows(){
        return excelSheet.getPhysicalNumberOfRows();
    }
}

