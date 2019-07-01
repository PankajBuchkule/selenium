package tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) 
	{
				//Edit by Pankaj line no 13
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.geckodriver-64bit.driver","D:\\Selenium\\geckodriver-64bit.exe");
		//System.setProperty("webdriver.IEDriverServer.driver","D:\\Selenium\\IEDriverServer.exe");
		

		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.excellonsoft.com/");
				
		driver.manage().window().maximize();
		
		driver.close();
	}

}
