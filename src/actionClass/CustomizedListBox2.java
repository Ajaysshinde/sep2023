package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(2000);
        WebElement monthList = driver.findElement(By.xpath("//select[@id='month']"));
        Actions act=new Actions(driver);
        act.click(monthList).perform();
        String expMonth="Oct";
        String actMonth="";
        int j=1;
        act.click(monthList).perform();
        for(int i=0;i<=12;i++)
        {
        	act.sendKeys(Keys.ARROW_UP).perform();
        }
        Thread.sleep(2000);
        while(!actMonth.equals(expMonth))
        {
        	
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(2000);
        	j++;
         	actMonth=driver.findElement(By.xpath("//select[@id='month']/option["+j+"]")).getText();
        }
         act.sendKeys(Keys.ENTER).perform();
	}

}
