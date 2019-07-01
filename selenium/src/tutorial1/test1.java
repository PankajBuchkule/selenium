package tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) 
	{
				
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.excellonsoft.com/");
				
		driver.manage().window().maximize();
		
		driver.close();
	}

}
