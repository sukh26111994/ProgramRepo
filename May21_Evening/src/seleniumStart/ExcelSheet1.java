package seleniumStart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path = "E:\\selenium\\ExCelSheet\\MayEvening2021.xlsx";
	for(int i=7;i<=10;i++) {
		for(int j=1;j<4;j++) {
			FileInputStream f=new FileInputStream(path);
			String val1 = WorkbookFactory.create(f).getSheet("Velocity").getRow(i).getCell(j).getStringCellValue();
			//int val2 = WorkbookFactory.create(f).getSheet("Velocity").getLastRowNum();
			System.out.print( val1);
			//System.out.print( val2);
		}
		System.out.println(" ");
	}
}
}
