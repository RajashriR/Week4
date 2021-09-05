package week4day1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		//step 1:Locate the Table
		
		WebElement Table = driver.findElement(By.id("table_id"));
	    
		//Step 2:Locate row count
		List<WebElement> row = Table.findElements(By.tagName("tr"));
		System.out.println("Number of rows : "+ row.size());
		
		//Step 3: getting columns
		WebElement rowindex = row.get(2);
		List<WebElement> columncount = rowindex.findElements(By.tagName("td"));
		
		System.out.println("column count : " +columncount.size());
		
		//Getting all the rows
		for  (WebElement webElement2 : row) {
			String text = webElement2.getText();
			System.out.println(text);
					}
	
		//Getting a particular column
		
	for (int i = 1; i < row.size(); i++) {
		     WebElement  webelement1 = row.get(i);
		    List<WebElement> secondcolumn = webelement1.findElements(By.tagName("td"));
		    String columns =secondcolumn.get(4).getText();
		    System.out.println(columns);
		
	}
		
		
	}
	}
	
