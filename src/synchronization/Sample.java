package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
 //Implicit wait()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://softwaretestingo.blogspot.com/2020/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
 //Explicit Wait()  
        WebDriverWait eWait = new WebDriverWait(driver,Duration.ofSeconds(5000));
        Boolean textpresent = eWait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//button[@onclick=\"timedText()\"]/following::p"), "Manual Testing"));
       // String text = driver.findElement(By.xpath("//button[@onclick=\"timedText()\"]/following::p")).getText();
	    System.out.println(textpresent);
	}

}
