package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.globalsqa.com/demo-site/tooltip/");
        Thread.sleep(2000);
        driver.switchTo().frame(3);
        WebElement TowerImage = driver.findElement(By.xpath("//img[@alt='Tower Bridge']"));
        Actions act=new Actions(driver);
        act.moveToElement(TowerImage).perform();
        Thread.sleep(2000);
        String towerbridge = driver.findElement(By.xpath("(//div[@class='ui-widget-header ui-corner-all'])[2]")).getText();
        System.out.println(towerbridge);
	}

}
