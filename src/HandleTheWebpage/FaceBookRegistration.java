package HandleTheWebpage;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FaceBookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement createAccBtn=driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
 //click the button
        createAccBtn.click();
        Thread.sleep(2000);
// //sendkeys
         WebElement firstname=driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[1]"));
//       firstname.sendKeys("Ajay");
//       firstname.clear();
//       firstname.sendKeys("Amit");
//       Thread.sleep(2000);
////gettext
//       String text=driver.findElement(By.xpath("(//p[@class=\"_58mv\"])[1]")).getText();
//       System.out.println(text);
//       Thread.sleep(2000);
////getattribute
//        String fattri=firstname.getAttribute("class");
//        System.out.println(fattri);
//        Thread.sleep(2000);
//
////gettagname
//        String tag=firstname.getTagName();
//        System.out.println(tag);
//        Thread.sleep(2000);
        
//getlocation
//         =driver.findElement(By.xpath("//input[@data-type=\"password\"]")).getLocation();
//         Point location=firstname.getLocation();
//         location.getX();
         
//getsize()
//         org.openqa.selenium.Dimension firstN = firstname.getSize();
//         System.out.println(firstN);
//         System.out.println("First textbox height= ",+firstN.getHeight());
//         
 //isSelected()
         WebElement female=driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
         System.out.println("Female Radio button status="+female.isSelected());
         Thread.sleep(2000);
         female.click();
         System.out.println("Female Radio button status="+female.isSelected());
         Thread.sleep(2000);
//isdisplayed()
         driver.findElement(By.xpath("//img[@class=\"_8idr img\"]")).click();
         Thread.sleep(2000);
         boolean logostatus=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
         System.out.println("logo display Status="+logostatus);
 //isEnable()
         WebElement loginbtn=driver.findElement(By.xpath("//button[@name=\"login\"]"));
         boolean btnstatus1 =  loginbtn.isEnabled();
        System.out.println("Loin button status="+btnstatus1);
        
//Submit()  This methos we use only click on button for submut attribute value 
        //loginbtn.submit();
        loginbtn.click();
        
        
        
	}

}
