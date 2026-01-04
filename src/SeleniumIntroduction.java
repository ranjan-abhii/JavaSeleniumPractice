import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		System.setProperty("webdriver.chrome.driver", "/Users/abhiiperiperi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Opening URL
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();    //Close will be used when only one tab is being used and needs to be closed.
//		driver.quit();   //Quit will be used where multiple tabs gets opened and we have to close all 
		
	}

}
