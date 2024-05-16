package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsuse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[1]")).sendKeys("Ajay");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]")).sendKeys("Shinde");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8788903640");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("Ajay@123");
        Thread.sleep(2000);
        
	}

}
