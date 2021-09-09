package seleniumStart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelForLoop {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path = "E:\\selenium\\ExCelSheet\\MayEvening2021.xlsx";
for(int i=0;i<=2;i++) {
	for(int j=0;j<=2;j++) {
		
		FileInputStream f = new FileInputStream(path);
	  double val1 = WorkbookFactory.create(f).getSheet("Velocity").getRow(i).getCell(j).getNumericCellValue();
		//System.out.print(val1);
		if(i==j) {
		System.out.print(val1 );
		}else {
			System.out.print("");
		}
			
	}
	System.out.println();
}

}
}
