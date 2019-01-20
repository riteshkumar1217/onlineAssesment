import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("D:\\plagiarism.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rc = sh.getLastRowNum();
		for(int i=0;i<rc;i++)
		{
			Row r=sh.getRow(i);
			int cc=r.getLastCellNum();
			for(int j=0;j<cc;j++)
			{
				String v=r.getCell(j).getStringCellValue().toString();
				System.out.println(v);
			}
		}
		
		FileOutputStream fos=new FileOutputStream("D:\\Outputplagiarism.xls");
		wb.write(fos);
		
		
//		Sheet s = wb.getSheet("Sheet1");
//		Row rc =s.getRow(0);
//		int cc = rc.getLastCellNum();
//		String v="";
//		System.out.println(cc);
//		for (int i=0;i<cc;i++)
//		{
//			v =rc.getCell(i).getStringCellValue();			
//			System.out.println(v);
//		}	

	}

}
