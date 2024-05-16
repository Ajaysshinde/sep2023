package popup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        
//Alert popup
//        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//        Thread.sleep(2000);
//        Alert alt = driver.switchTo().alert();
//        String text = alt.getText();
//        System.out.println(text);
//        Thread.sleep(2000);
//
//        alt.accept();
//confirmation  
//        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//        Thread.sleep(2000);
//        Alert confirmAlert = driver.switchTo().alert();
//        String conftext = confirmAlert.getText();
//        System.out.println("confirm alert text=="+conftext);
//        
//       // confirmAlert.accept();
//        confirmAlert.dismiss();
 //prompt Alert
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);
        
//        Alert promptalert=driver.switchTo().alert();
//        String promptAlertText = promptalert.getText();
//        System.out.println("prompt alert text=="+promptAlertText);
//        promptalert.sendKeys("Hii ATIpune");
//        Thread.sleep(2000);
//        
          //promptalert.accept();
//        promptalert.dismiss();
//        String alerttext = driver.findElement(By.xpath("(//span[@class='mr-3'])[1]")).getText();
//        System.out.println("Text on Webpage=="+alerttext);
//        
        

	}

}
