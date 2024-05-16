package HandleTheWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saample {
	public static void main(String[] args) throws InterruptedException
	{
	String key="webdriver.edge.driver";
	String value="C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe";
	String url="https://digitalzoop.com.au/qtc/contact-us/";
	System.setProperty(key,value);
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(2000);

	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.findElement(By.id("wpforms-6931-field_0")).sendKeys("Ati");
	Thread.sleep(2000);

}}
