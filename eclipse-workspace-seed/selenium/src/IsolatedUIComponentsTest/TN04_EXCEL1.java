package test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TN04_EXCEL1 {
	String fpath="C:\\Users\\akank\\Desktop\\TN04\\Testdata1.xlsx";
	File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    
@Test
public void writingtoXcel() {
row=sheet.createRow(0);
cell=row.createCell(0);
cell.setCellValue("Seed Infotech");
row.createCell(1).setCellValue("Hadapsar");

row=sheet.createRow(1);
row.createCell(0).setCellValue("TeastNG");
row.createCell(0).setCellValue("Automation");

}
@BeforeTest
public void beforeTest() throws IOException {
file=new File(fpath);
fos=new  FileOutputStream (file);
wb=new  XSSFWorkbook();
sheet=wb.createSheet("student data");

}

@AfterTest
public void afterTest()throws IOException {
wb.write(fos);
wb.close();
fos.close();// connection with the file will be close
}

}
