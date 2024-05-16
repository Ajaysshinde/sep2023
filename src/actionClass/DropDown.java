package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement electronicsCategory = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[4]"));
        Actions act=new Actions(driver);
        act.moveToElement(electronicsCategory).perform();
        WebElement LaptopNDesktop = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
        act.moveToElement(LaptopNDesktop).perform();
        
        
        
	}

}
