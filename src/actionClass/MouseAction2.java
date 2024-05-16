package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.onlinesbi.sbi/");
        Thread.sleep(10000);
        WebElement loans = driver.findElement(By.xpath("//a[@id='sm-17136880976453557-16']"));
         
        Actions act=new Actions(driver);
        act.moveToElement(loans).perform();
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='dropdown']//a"));
        for(WebElement option:list)
        {
        	act.moveToElement(option).perform();
        	Thread.sleep(2000);
        }
        loans.click();
        
	}

}
