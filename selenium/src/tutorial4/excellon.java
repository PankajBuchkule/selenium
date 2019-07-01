package tutorial4;
import java.rmi.AccessException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
*/

public class excellon {

    public static void main(String[] args)throws InterruptedException, AccessException  {

		System.out.println("launching chrome browser succesfully..");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();		
            driver.manage().window().maximize();
            String url = "https://dev-balib.traya.net/";
            driver.get(url);
            
            driver.findElement(By.xpath("//input[@class='dx-texteditor-input']")).sendKeys("pankajb@excellonsoft.com");
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
			Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@class='mt-4 login-button btn btn-outline-primary']")).click();
            Thread.sleep(1000);
            
            System.out.println("Excellon Portal login succesfully..");
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[1]/div[1]/div/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//html//body//div[1]//div//div[2]//div//ul//li[1]//div[2]//ul//li")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/button/div[1]")).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div[1]")).click();
             
            Thread.sleep(1000);
            driver.findElement(By.id("dx-2d94025a-0c27-a770-7c62-08d1ab2f1d62")).click();
            Select contact = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div[1]")));
            WebElement option = contact.getFirstSelectedOption();
            String defaultItem = option.getText();
            System.out.println(defaultItem );
            //contact.selectByIndex(1);
          //contact.selectByValue("Anshuman Sharma");
           
    
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div[1][text()='Anshuman Sharma']")).click();
          //driver.findElement(By.xpath("//option[text()='float']")).click(); 
          
          Select selectByVisibleText = new Select (driver.findElement(By.id("Anshuman Sharma")));
          selectByVisibleText.selectByVisibleText("Anshuman Sharma");  
            Thread.sleep(1000);
           
          //driver.findElement(By.xpath("//span[@class='dx-texteditor-input']")).click();
          //driver.findElement(By.xpath("//span[@class='dx-texteditor-input')")).sendKeys("9821121212");
            Thread.sleep(1000);
          //driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/button[1]/div[1]")).click();//Clicked on save button
    }
    
}