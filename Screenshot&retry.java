package SeleniumTestscripts;



import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import project.pages.OrangeHRPPages;


public class TestCase11_12 extends TestBase {

	OrangeHRPPages OrangeOR;
	WebDriver Driver;
	Properties prop;

	@Test(priority=1)
	@Parameters({"Browser","Url", })
	public void Login(String Browser, String Url) {

		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			Driver 	= new ChromeDriver(co);
		} else if(Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Soft\\Jarfiles\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			Driver 	= new InternetExplorerDriver();
		} 

		FileInputStream fileLoc;
		try {
			String PropertiesFileLoc ="C:/Users/karrivi/git/SeleniumAssignment/LiveProject/src/test/java/project/testdata/OrangeHRPTestdata.properties";
			fileLoc = new FileInputStream(PropertiesFileLoc);
			prop = new Properties();
			prop.load(fileLoc);
			//System.out.println(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		OrangeOR = new OrangeHRPPages(Driver);
		Driver.manage().window().maximize();
		String Title = Driver.getTitle();
		System.out.println(Title);
		Driver.get(Url);
		
		String  Name = prop.getProperty("username");
			OrangeOR.settextforUserName(Name);
		String  Pswrd = prop.getProperty("password");
			OrangeOR.setTextforPassword(Pswrd);
			OrangeOR.setStaySignedInClick();
	}

	@Test(priority=2 , retryAnalyzer=listener.RetryAnalyzer.class)


	public void method1() throws Exception
	{


		String DashBoardHeader = OrangeOR.GetDashBoardHeaderText();
		boolean res = DashBoardHeader.equalsIgnoreCase("Dashboard");
		if(res)
		{
			Thread.sleep(4000);
			getScreenshot(Driver,"DashBoardPassed.jpg");
			Assert.assertTrue(true); 
			Reporter.log("User is in Dashboard Menu", true);;

		}
		else
		{
			int i = 1; 
			getScreenshot(Driver,"DashBoard Failed Interation = "+ i);
			Assert.assertTrue(false); 
			Reporter.log("User is NOT in Dashboard Menu", true);
			i++;

		} 

	}

	@Test(priority=3)
	public void tearDown() {
		Driver.quit();
	}
