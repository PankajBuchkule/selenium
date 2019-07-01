package tutorial2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\geckodriver-64bit.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new IEDriverServer();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.excellonsoft.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);		
		driver.close();
	}

}
