package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
 //index 
        // driver.switchTo().frame(4);
//id or name
        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println(text);
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("frame2");
        String text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        System.out.println(text2);
        
        
	}

}
