package tutorial3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailDemo {

    public static void main(String[] args) {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
            driver.manage().window().maximize();

            String url = "https://accounts.google.com/signin";

            driver.get(url);
            
            String strPageTitle = driver.getTitle();
    		System.out.println("Page title: - "+strPageTitle);	

            driver.findElement(By.id("identifierId")).sendKeys("panks145"); 

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

            WebDriverWait wait=new WebDriverWait(driver, 20);               

            driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
            
            driver.findElement(By.name("password")).sendKeys("guttspnkj"); 
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
            driver.findElement(By.id("passwordNext")).click(); 



    }  

}