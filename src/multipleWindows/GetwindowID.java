package multipleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.mahaconnect.in/jsp/index.html#");
        Thread.sleep(2000);
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        //794FF1BB58BBD7F66015FB2BCE3EE83D
        driver.navigate().refresh();
        String windowID2 = driver.getWindowHandle();
        System.out.println(windowID2);
        Thread.sleep(10000);
        driver.close();

        

		

	}

}
