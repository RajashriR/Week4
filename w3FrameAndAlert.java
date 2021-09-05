package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3FrameAndAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    //Frame
		WebElement frame1 = driver.findElementByXPath("//iframe[@id ='iframeResult']");
	    driver.switchTo().frame(frame1);
	    driver.findElementByXPath("//button[text() ='Try it']").click();
	   
	    //Alert 
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    String text = driver.findElementByXPath("//button[text() ='Try it']").getText();
	   
	    
	    
	    if( text.contains("You pressed OK!"))
	    {
	    System.out.println("You pressed ok");	
	    }
	    else
	    	System.out.println("you Pressed cancel");
	    
	}

}
