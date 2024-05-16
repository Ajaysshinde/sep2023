package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        Actions act=new Actions(driver);
//        
//       act.moveToElement(null, 0, 0)
//       driver.findElement(By.xpath("")).click();
        
//left click()
       // act.click().perform();
//Right click()
        WebElement loginBtn = driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]"));
      // act.moveToElement(loginBtn).contextClick().build().perform();
       act.contextClick(loginBtn).perform();
//Double click --->> 2 times left click
       act.doubleClick(loginBtn).perform();
        
	}

}
