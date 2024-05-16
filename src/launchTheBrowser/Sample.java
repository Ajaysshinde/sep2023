package launchTheBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value ="C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
	
		
	}

}
