package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnFrames {

	
		public static void main(String[] args) throws InterruptedException{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/frame.html");
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//simple frames
			WebElement frame1 =driver.findElementByXPath("//div[@id ='wrapframe'][1]/iframe");
			driver.switchTo().frame(frame1);
			driver.findElement(By.id("Click")).click();
			driver.switchTo().defaultContent();
			
			//Nested Frames
			WebElement nestedframe = driver.findElement(By.xpath("//div[@id ='wrapframe'][2]/iframe"));
			driver.switchTo().frame(nestedframe);
			driver.switchTo().frame("frame2");
			driver.findElement(By.id("Click1")).click();
			driver.switchTo().defaultContent();
	}

}
