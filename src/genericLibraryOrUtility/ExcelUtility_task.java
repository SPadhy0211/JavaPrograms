package genericLibraryOrUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility_task {
	public String getDataFromExcel(String sheetName,int rowNo,int cellNo) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SampleTestCase.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh= book.getSheet(sheetName);
		DataFormatter format = new DataFormatter();
        String data = format.formatCellValue(sh.getRow(rowNo).getCell(cellNo));
        return data;
		
		
		
	}
}
