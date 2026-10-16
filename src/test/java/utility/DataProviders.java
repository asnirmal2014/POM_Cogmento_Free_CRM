package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviders 
{   
	@Test
	public void loginAppThroughExcelData() throws IOException, InterruptedException 
	{
		Reporter.log("loginAppThroughExcelData", true);
		// File file = new File("D:\\eclipse-workspace\\mvnfmkPOM\\testdata\\TestingSheet_fmk_2.xlsx");

		File file = new File("D:\\eclipse-workspace-1\\MVN_POM_JENKINS_7\\testdata\\TestingSheet_fmk_test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		XSSFRow row = sheet.getRow(6);
		XSSFCell cell = row.getCell(1);
		String email_Values = cell.getStringCellValue();       // email

		XSSFRow row_ = sheet.getRow(6);
		XSSFCell cell_ = row.getCell(2);
		String password_Values = cell_.getStringCellValue();   // password

		System.out.println("email_Value : " + email_Values);
		System.out.println("password_Value : " + password_Values);

		// LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		// loginPage.loginToCRM(email_Values, password_Values);

		wb.close();
	}
}
