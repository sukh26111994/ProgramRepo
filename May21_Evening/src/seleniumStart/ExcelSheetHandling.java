package seleniumStart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetHandling {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path = "E:\\selenium\\ExCelSheet\\MayEvening2021.xlsx";
	
	FileInputStream f=new FileInputStream(path);
//	String val1 = WorkbookFactory.create(f).getSheet("Velocity").getRow(0).getCell(0).getStringCellValue();
//	System.out.println("The data is:="+val1);
	
//	double val2 = WorkbookFactory.create(f).getSheet("Velocity").getRow(0).getCell(0).getNumericCellValue();
//	System.out.println("The value is ="+val2);
	
	CellType val3 = WorkbookFactory.create(f).getSheet("Velocity").getRow(0).getCell(0).getCellType();
	System.out.println(val3);
}
}
