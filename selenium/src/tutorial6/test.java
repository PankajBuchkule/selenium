package tutorial6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) 
	{
				
		System.out.println("launching chrome browser succefully by QA..!!");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https:\\google.com");
				
		driver.manage().window().maximize();
		
		driver.close();
	}

}
