package seleniumStart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	String path = "E:\\selenium\\ExCelSheet\\Project1.xlsx";
	FileOutputStream output=new FileOutputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("sukhada");
	String sk [] []= {{"sukh","priya","chetu"},{"a","b","c"}};
	int rows=sk.length;
	int colm=sk[0].length;
	for(int i=0;i<rows;i++) {
		XSSFRow row=sheet.createRow(i);
		for(int j=0;j<colm;j++) {
			XSSFCell cell=row.createCell(j);
			String value=sk[i][j];
			cell.setCellValue(value);
			
		}
	}
	workbook.write(output);
	output.close();
}
}
