package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadTheDataFrmExcel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
File file=new File("./src/test/resources/data/projectt1.xlsx");
FileInputStream f=new FileInputStream(file);
Workbook book=new XSSFWorkbook(f);
Sheet sheets=book.getSheet("Studentwork");
Row row=sheets.getRow(2);
Cell cell=row.getCell(0);
String stringcellvalue=cell.getStringCellValue();
System.out.println(stringcellvalue);
Cell cell2=row.getCell(2);
double d=cell2.getNumericCellValue();
long l=(long)d;
System.out.println(l);



	}

}
