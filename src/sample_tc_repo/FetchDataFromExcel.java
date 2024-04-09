package sample_tc_repo;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SampleTestCase.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		/*Row r = sh.getRow(1);
		Cell c = r.getCell(2);
		String CELLVALUE = c.getStringCellValue();
		System.out.println(CELLVALUE);
		*/
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sh.getRow(2).getCell(1));
		System.out.println(data);
		
	}

}
