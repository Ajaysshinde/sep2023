package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	        Thread.sleep(2000);
	         List<WebElement> options = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
             System.out.println(options.size());
             for(int i=0;i<options.size();i++)
             {
            	
            	 System.out.println(options.get(i).getText());
             }
	         
	}

}
