package SeleniumTestscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import project.pages.OrangeHRPPages;




public class TestCase1 {
	OrangeHRPPages OrangeOR;
	WebDriver Driver;
	
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		Driver 	= new ChromeDriver(co);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		OrangeOR = new OrangeHRPPages(Driver);
	}

}