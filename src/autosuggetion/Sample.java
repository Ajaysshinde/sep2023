package autosuggetion;

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
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Samsung");
        Thread.sleep(2000);
        
        List<WebElement> options=driver.findElements(By.xpath("//li[@role=\"presentation\"]//div[2]//div[1]//div[1]"));
       System.out.println(options.size());	

//print app options
       for(WebElement option :options)
       {
    	   System.out.println(option.getText());
       }
//click on text
       
       String exptext = "samsung s24 ultra price";
       for (WebElement option:options)
       {
    	   String acttext = option.getText();
    	   if(exptext.equals(acttext))
    	   {
    		   option.click();
    		   break;
    	   }
    	   
       }
       
	}
	}