package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnAlert {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Simple Alert
		driver.findElementByXPath("//button[text() ='Alert Box']").click();
		Thread.sleep(2000);
		//switch control to another window
		Alert alert = driver.switchTo().alert(); 
		alert.getText();
		System.out.println("Alert :" + alert);
		alert.accept();
		
		//confirmation Alert
		driver.findElementByXPath("//button[text() ='Confirm Box']").click();
		Thread.sleep(1000);
		alert.dismiss();
		String result = driver.findElementByXPath("//p[@id ='result']").getText();
		if (result.contains("You pressed Cancel!"))
		{
			System.out.println("You pressed cancel");
		}
		else 
			System.out.println("you pressed ok");
				
		
		//Prompt alert
		driver.findElementByXPath("//button[text() ='Prompt Box']").click();
		alert.sendKeys("Edu");
		Thread.sleep(1000);
		
		alert.accept();
		String result1 = driver.findElementByXPath("//p[@id ='result1']").getText();
		if (result1.contains("You should have enjoyed learning at TestLeaf."))
		{
			System.out.println("You pressed ok");
		}
		else 
			System.out.println("for prompt you pressed cancel");
				

	}

}
