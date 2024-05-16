package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BackspaceNDelete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys("Samsung");       
        Actions act=new Actions(driver);
        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);
 //Delete    
        act.keyDown(Keys.CONTROL).sendKeys("A"+"C").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
        Thread.sleep(2000);
   
        
	}

}


