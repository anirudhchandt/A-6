package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.annotations.VisibleForTesting;
import com.sun.org.apache.bcel.internal.classfile.Method;

import pom.Homepage;
import pom.Loginpage;

public class BaseClass {
	public static WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter reporter;
	ExtentTest etest;
	LocalDateTime dateTime;
	String date;
	utilityClass um=new utilityClass();
	Loginpage loginDetails=new Loginpage(driver);
	Homepage hp=new Homepage(driver);

	@BeforeSuite(alwaysRun = true)
	public void extndreport() {
		dateTime = LocalDateTime.now();
		date = dateTime.toString().replace(":", "-");
		reports = new ExtentReports();
		reporter = new ExtentSparkReporter("./extend report/" + date + ".html");
		reports.attachReporter(reporter);
	}
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(um.geturl("url"));
			
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginUser(Method method) throws EncryptedDocumentException, IOException
	{
		etest=reports.createTest(method.getName());
		etest.log(Status.INFO, "The execution started");
		FileInputStream file = new FileInputStream("./src/test/resources/testdata/demowebshopdata.xlsx");
		Workbook book = WorkbookFactory.create(file);
		String etext = book.getSheet("Sheet1").getRow(0).getCell(3).toString();
		loginDetails.getEmailTextbox().sendKeys(etext);
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		hp.getLogoutButton().click();
	}
	
	@AfterClass
	public void quitbro()
	{
		driver.quit();
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("Close the connection");
	}

}
