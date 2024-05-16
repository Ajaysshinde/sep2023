package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //temp folder
        
        Date d=new Date();                
        String timestamp = d.toString().replace("", "_").replace(':', '_');
        
        
        File dest = new File("C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\"
        		+ "screenshot\\"+timestamp+".jpg");
        FileHandler.copy(src, dest);
        
	}

}
