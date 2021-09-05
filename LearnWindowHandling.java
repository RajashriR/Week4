package week4day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	private static Set<String> window;

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Window.html");
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
			driver.findElementById("home").click();
			//Step 1: window handle & Set of Strings
			Set<String> windowHandleset   =  driver.getWindowHandles();
			//Step 3:Convert Set to List
			List<String> WindowHandleList = new ArrayList<String>(windowHandleset);
			//Step 4:Get the window by index
			//String window1 = WindowHandleList.get(1);
			//Step 5:Switch Window
			
			driver.switchTo().window(WindowHandleList.get(1));
			System.out.println(driver.getTitle());
			System.out.println("Number of windows : " + WindowHandleList.size());
			
			driver.switchTo().window(WindowHandleList.get(0));
			System.out.println(driver.getTitle());

	}

}
