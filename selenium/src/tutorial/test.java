package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) 
	{
				// Edit By Pankaj - test first selenium/src folder
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("What problem");
	
		driver.get("https:\\google.com");
				
		driver.manage().window().maximize();
		
		driver.close();
	}

}
