package popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddeDivisions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2F");
        Thread.sleep(2000);
        String text1 = driver.findElement(By.xpath("//p[@class='_1-pxlW']/span")).getText();
        System.out.println(text1);
        String text2 = driver.findElement(By.xpath("//div[@class='_1Ijv5h']")).getText();
        System.out.println(text2);
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("ajaysshinde@gmail.com");
        
        

	}

}




	