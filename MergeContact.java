package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 2. Enter UserName and Password Using Id Locator
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		
		 // 5. Click on contacts Button
		
		driver.findElementByLinkText("Contacts").click();
		
		 
		 // 6. Click on Merge Contacts using Xpath Locator
		driver.findElementByXPath("//a[text() ='Merge Contacts']").click();
		
		 
		 // 7. Click on Widget of From Contact
		driver.findElementByXPath("//img[ @src ='/images/fieldlookup.gif']").click();
		  
		 //8. Click on First Resulting Contact
		  
		  
		 /* 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
	}

}
