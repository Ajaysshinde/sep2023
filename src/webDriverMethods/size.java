package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		Dimension d=new Dimension(500, 500); 
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		driver.close();
	}

}

