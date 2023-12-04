package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		// WebElement fn=dr.findElement(By.xpath("//input[@placeholder='First name']"));
			// fn=sendKeys("SQI testing");
			 
   //dr.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("SQI");
       // Thread.sleep(5000);
        
      dr.findElement(By.id("checkbox1")).click();
        Thread.sleep(5000);
        
        dr.findElement(By.partialLinkText("sell on Amazon")).click();
        
        
       dr.quit();
}


	
	

	
	
}