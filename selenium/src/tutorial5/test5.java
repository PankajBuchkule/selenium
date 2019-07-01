package tutorial5;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test5 {

    public static void main(String[] args)throws InterruptedException  {

		System.out.println("launching chrome browser succesfully..");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();		
            driver.manage().window().maximize();
            String url = "https://dev-balib.traya.net/";
            driver.get(url);
            
            driver.findElement(By.xpath("//input[@class='dx-texteditor-input']")).sendKeys("pankajb@excellonsoft.com");
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
			Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='mt-4 login-button btn btn-outline-primary']")).click();
            Thread.sleep(2000);
            
            System.out.println("Excellon Portal login succesfully..");
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[1]/div[1]/div/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//html//body//div[1]//div//div[2]//div//ul//li[1]//div[2]//ul//li")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/button/div[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='dx-popup-content']")).getText();
            driver.findElement(By.xpath("//input[@class='dx-item-content dx-list-item-content']")).click();
            driver.findElement(By.xpath("//input[@class='dx-numberbox dx-texteditor dx-editor-underlined dx-widget dx-texteditor-empty dx-validator dx-visibility-change-handler']")).sendKeys("9881212334");
     
            driver.close();
                    
    }
}