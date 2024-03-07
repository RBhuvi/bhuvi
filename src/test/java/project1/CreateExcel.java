package project1;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateExcel {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		// TODO Auto-generated method stub
		File f=new File("./src/test/resources/data/excel.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet s=book.createSheet("Course");
		Row createrow=s.createRow(0);
		Cell createcell=createrow.createCell(0);
		createcell.setCellValue("Java");
		FileOutputStream out=new FileOutputStream(f);
		book.write(out);
		

	}

}
