package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/selectable/");
        Thread.sleep(2000);
        
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//li[text()='Item 5']")).click();
       // driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("(//li[@class='menu-item'])[1]")).click();
        Thread.sleep(2000);
        

	}

}
