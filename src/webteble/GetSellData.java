package webteble;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSellData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://chercher.tech/practice/table");
        Thread.sleep(2000);
        String expValue="Selenium Webdriver";
        System.out.println(expValue);
        String actvalue = driver.findElement(By.xpath("//td[text()='Selenium Webdriver']")).getText();
        if(actvalue.equalsIgnoreCase(expValue))
        {
        	System.out.println("Test case is pass");
        }

	}

}
