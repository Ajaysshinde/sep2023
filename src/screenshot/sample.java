package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
 //1 typcast driver into TakeScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
//2 call the getScreenshotAs() and pass the OutputType.File parameter
		
	    File srclocation = ts.getScreenshotAs(OutputType.FILE);
	    System.out.println(srclocation);
	    File destLocation = new File("C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\src\\screenshot\\ss.jpg");
		FileHandler.copy(srclocation, destLocation);
        

}
}