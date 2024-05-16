package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ssample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
 //gettitle
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	//gettitle
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
	//getcurrenturl
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	//getpagesource
	    String pagesrc = driver.getPageSource();
	    System.out.println(pagesrc);
     //manage()
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		
    //close()
		//driver.close();
	//quite() 
		driver.quit();
   
		
		
		
		
	}

}
