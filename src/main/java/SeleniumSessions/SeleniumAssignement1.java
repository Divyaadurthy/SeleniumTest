package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignement1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @author divyaadurthy
		 * This is automated page for form filling 
		 * https://classic.crmpro.com/register/
		 * @parameters
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/divyaadurthy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		WebElement name = driver.findElement(By.name("first_name"));
		name.sendKeys("Divya ");
		WebElement lastName = driver.findElement(By.name("surname"));
		lastName.sendKeys("Adurthy ");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[5]/input"));
		email.sendKeys("svdivyac@gmail.com");
		WebElement confirmEmail = driver.findElement(By.cssSelector("#multipleForm > div:nth-child(7) > input"));
		confirmEmail.sendKeys("svdivyac@gmail.com");
		driver.findElement(By.name("username")).sendKeys("Divya123");
		driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[8]/input")).sendKeys("1234567");
		driver.findElement(By.name("passwordconfirm")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).click();
		driver.findElement(By.className("myButton")).click();

	}
}
