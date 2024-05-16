//lecture no 8
package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple {
	public static void main(String[] args) throws InterruptedException {
	
//		String a=System.getProperty("user.dir")+"C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium";
//        System.out.println(a);
		
//	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\r\n"
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);

//color dropdown
        WebElement colourlist=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
        Select s = new Select(colourlist);
//select the option
        s.selectByValue("3");
        Thread.sleep(2000);
        boolean listboxststus=s.isMultiple();
        System.out.println("IS Listbox MultiSelectable="+listboxststus);
//get all option in list
        System.out.println("List of all option in list box");
        List<WebElement> alloption=s.getOptions();
        for(WebElement option:alloption)
        {
          System.out.println(option.getText());
        }
        
//getAllSelectedoptions()
        System.out.println("***** All selected option form listbox=");
         List<WebElement> Selectedalloption=s.getAllSelectedOptions();
         System.out.println(Selectedalloption.size());
        for(WebElement option:Selectedalloption)
        {
          System.out.println(option.getText());
        }
//getFirstSelectedOptions()
            WebElement firstselectedoptions = s.getFirstSelectedOption(); 
            System.out.println("getFirstSelectedOptions="+firstselectedoptions.getText());
            
         
        Thread.sleep(5000);
        driver.close();
		}
}