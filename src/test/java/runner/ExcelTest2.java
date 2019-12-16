package runner;

import utilities.ExcelUtils;

public class ExcelTest2 {

    public static void main(String[] args) {

        ExcelUtils.openExcelFile("testData","Sheet1");
        System.out.println(ExcelUtils.getValue(1,1));

    }
}
