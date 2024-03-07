package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateReadExcel {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		//To locate the file
		File file=new File("./src/test/resources/data/Book1.xlsx");
//To locate file in to the field
		FileInputStream f=new FileInputStream(file);
//To define format of excel
		Workbook book=new XSSFWorkbook(f);
//To get the sheet
		Sheet sheet=book.getSheet("Work");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) 
			{
				Cell cell=row.getCell(j);
//To find the cell whether it is number or string
				CellType celltype=cell.getCellType();
				switch(celltype) 
				{
				case STRING:
					String stringcellvalue=cell.getStringCellValue();
					System.out.println(stringcellvalue);
					break;
				
				default:
				{
					if(DateUtil.isCellDateFormatted(cell))
					{
					Date datecellvalue= cell.getDateCellValue();
					SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
					String format=sd.format(datecellvalue);
				    System.out.println(format);
				    
					}
					else
					{
						double numericcellvalue=cell.getNumericCellValue();
						long number=(long)numericcellvalue;
						System.out.println(number);
					}
						break;
				}
			}
		}
	}
	}
}


