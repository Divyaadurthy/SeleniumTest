package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/divyaadurthy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login?_ga=2.94883935.293041589.1554937513-547862258.1554937513");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		// WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"username\"]"));
		driver.findElement(By.cssSelector("#username"));
	}

}
