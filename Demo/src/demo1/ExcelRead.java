package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\plagiarism.xls");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		int r =sh.getLastRowNum();
		for(int i=0;i<r+1;i++)
		{
			Row rw=sh.getRow(i);
			int cc =rw.getLastCellNum();
			for(int j=0;j<cc;j++)
			{
				String v =rw.getCell(j).getStringCellValue();
				System.out.println(v);
			}
		}

	}

}
