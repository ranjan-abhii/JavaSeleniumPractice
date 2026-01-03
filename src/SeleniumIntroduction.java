import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Opening URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Amazon", Keys.ENTER);
		
	}

}
