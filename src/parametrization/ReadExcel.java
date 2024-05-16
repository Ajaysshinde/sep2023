package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		
		String excelpath=System.getProperty("C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\TestData\\Book1.xlsx");
        FileInputStream fis=new FileInputStream(excelpath);
        Workbook wf = WorkbookFactory.create(fis);
        Sheet s = wf.getSheet("Sheet1");
        Row r = s.getRow(7);
        Cell c = r.getCell(0);
        CellType type = c.getCellType();
        System.out.println(type);
        
	}

}


