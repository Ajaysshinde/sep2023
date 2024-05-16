package webteble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetallTableData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://chercher.tech/practice/table");
  //Table count
        Thread.sleep(2000);
        List<WebElement> tableData = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for(WebElement data:tableData)
        {
        	System.out.println(data.getText());
        }
        	
//row count
        List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        System.out.println("Row Count="+row.size());
        
        
//column count
        List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
        System.out.println("Coulmn count="+column.size());
        
	}

}
