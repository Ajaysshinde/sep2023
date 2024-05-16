package multipleWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twowindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.mahaconnect.in/jsp/index.html#");
        Thread.sleep(2000);
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        driver.findElement(By.xpath("//p[@id='loginbtns']/a[1]/img")).click();
        Thread.sleep(2000);
        Set<String> windowsIDs = driver.getWindowHandles();
        ArrayList<String> a1 = new ArrayList<String>(windowsIDs);

        for(String id:windowsIDs)
        {
        	
        	System.out.println(id);
        }
         System.out.println(a1);
         a1.get(1);
         driver.switchTo().window(a1.get(1));
         Thread.sleep(2000);
        
         System.out.println(driver.getCurrentUrl());
         driver.findElement(By.xpath("//input[@id='userLogin:captchaInput']")).sendKeys("Ati Pune");
         
         driver.switchTo().window(a1.get(0).toString());
         driver.findElement(By.xpath("//a[text()='Utility Bill Payment']")).click();
         Thread.sleep(2000);
         //driver.close();
	     driver.quit();
         
	}

}
