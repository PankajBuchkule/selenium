package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

//EDIT BY PANKAJ
	public static void main(String[] args) 
	{
				
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Browser Lounch Successfully");
	
		driver.get("https:\\google.com");
				
		driver.manage().window().maximize();
		
		driver.close();
	}

}
