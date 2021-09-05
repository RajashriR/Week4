package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctcwindow {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
	//	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.irctc.co.in");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text() = 'OK']").click();
	
	}
}
