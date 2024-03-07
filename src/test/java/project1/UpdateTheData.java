package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateTheData {

	public static void main(String[] args) throws FileNotFoundException,IOException {
			// TODO Auto-generated method stub
	//To locate the file
			File file=new File("./src/test/resources/data/projectt1.xlsx");
	//To locate file in to the field
			FileInputStream f=new FileInputStream(file);
	//To define format of excel
			Workbook book=new XSSFWorkbook(f);
	//To get the sheet
			Sheet sheet=book.getSheet("Studentwork");
			for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
				Row row=sheet.getRow(i);
				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
					Cell cell=row.getCell(j);
	//To find the cell whether it is number or string
					CellType celltype=cell.getCellType();
					switch(celltype) {
					case STRING:
						String stringcellvalue=cell.getStringCellValue();
						System.out.println(stringcellvalue);
						if(stringcellvalue.equalsIgnoreCase("Java"))
						{
							cell.setCellValue("selenium");
							FileOutputStream out=new FileOutputStream(file);
							book.write(out);
						}
						break;
						default:
							double numericcellvalue=cell.getNumericCellValue();
							long number=(long)numericcellvalue;
							System.out.println(number);
							break;
					}
				
					
					System.out.println(" ");
					
				}
	}
}
}
