package listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
        Thread.sleep(2000);

        
//may - oct - july
        
       WebElement monthoptionDown=driver.findElement(By.xpath("//select[@id=\"month\"]"));      
       Select s =new Select(monthoptionDown);
       Thread.sleep(2000);
//SelectbyIndex()
       s.selectByIndex(5);
       Thread.sleep(2000);
//selectbyValue()
       s.selectByValue("10");
       Thread.sleep(2000);
//selectbyvisibletext()  
       s.selectByVisibleText("Jul");
       Thread.sleep(2000);
	}

}
