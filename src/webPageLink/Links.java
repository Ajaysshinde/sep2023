package webPageLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shri\\eclipse-workspace\\June2023_Selenium\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com/");
  
 //All links by Xpath
       // List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
          List<WebElement> allLinks = driver.findElements(By.tagName("a"));
          System.out.println("Total link available on webpage="+allLinks.size());
//          for(WebElement link:allLinks)
//          {
//        	  //System.out.println(link.getText());
//        	  //System.out.println(link.getText()+"- "+link.isEnabled());
//        	  System.out.println(link.getText()+"--"+link.getAttribute("href"));
//        	  
//          }
          int workinglinks=0;
          int brokenlinks=0;

          for(WebElement link:allLinks) 
          {
        	  String linkURL = link.getAttribute("href");
        	  URL url =new URL(linkURL);
        	  
        	  
        	  HttpURLConnection httpUrlconnection = (HttpURLConnection)url.openConnection();
        	  httpUrlconnection.setConnectTimeout(2000);
        	  httpUrlconnection.connect();
        	  if(httpUrlconnection.getResponseCode()==200)
        	  {
        		  System.out.println(linkURL+"--->"+"Valid Link"+httpUrlconnection.getResponseCode()+"--->"+httpUrlconnection.getResponseMessage());
        		  workinglinks++;   
        	  }
        	   else if(linkURL==null)
        	  {
        		  System.out.println(linkURL);
        	  }
        		  
        	  else
        	  {
        		  System.out.println(linkURL+"--->"+"broken Link"+httpUrlconnection.getResponseCode()+"--->"+httpUrlconnection.getResponseMessage());
        		  brokenlinks++;
        	  }
          }
        
          System.out.println("Broken links count="+brokenlinks);
          System.out.println("Working links count="+workinglinks);


}
}
