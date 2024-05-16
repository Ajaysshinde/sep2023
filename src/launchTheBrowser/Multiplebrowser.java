package launchTheBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Multiplebrowser {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=null;
			String browsername="htmlUnitDriver";
			
			if(browsername.equalsIgnoreCase("Chrome"))
			{
          //1 Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
			//2 Firefox driver
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\geckodriver.exe");
     		 driver = new ChromeDriver();
			
			}//Edge
			else if(browsername.equalsIgnoreCase("edge"))
			{
			//3 edge Driver
			System.setProperty("webdriver.edge.driver","C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\msedgedriver.exe");
			 driver = new ChromeDriver();
			 
			}else if(browsername.equalsIgnoreCase("htmlUnitDriver"))
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\msedgedriver.exe");
			    driver = new HtmlUnitDriver();
			    
			}//PhantumJS
//			else if(browsername.equalsIgnoreCase("PhantomJS"))
//			{
//				File file=new File("C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\jar_Files\\phantomjs.exe");
//				System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
//			    driver = new phantom
//			}
			
			      Thread.sleep(2000);
				  driver.get("https://www.flipkart.com/account/login");
				  Thread.sleep(2000);
				  String titleText = driver.getTitle();
				  System.out.println(titleText);

			// 4 opera driver
//			System.setProperty("webdriver.opera.driver","C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\operadriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.flipkart.com/account/login");

	}
	  
		

}
