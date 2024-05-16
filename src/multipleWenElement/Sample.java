package multipleWenElement;

import java.util.List;

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
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
//to print all header text
        List<WebElement> headers = driver.findElements(By.xpath("//form[@id='userForm']/div/div[1]/label"));
        for(WebElement header:headers)
        {
        	System.out.println(header.getText());
        }
        Thread.sleep(2000);

        System.out.println("**************");
//print all radio text
         List<WebElement> hobieslist = driver.findElements(By.xpath("//label[@class='custom-control-label']"));

         for(WebElement hobby:hobieslist)
         {
        	 
        	 System.out.println(hobby.getText());
         }
         Thread.sleep(2000);

//select all checkbox
//         List<WebElement> hobieslist1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//         for(WebElement hobby:hobieslist1)
//        	 
//         {
//        	 hobby.click();
//        	 Thread.sleep(2000);
//         }
	}

}
