package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/divyaadurthy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Page title is "+ title);
		
		/*
		 * 
		 * Validation point
		 */
		if(title.equals("Google"))
		{
		System.out.println("Correct Title");
		}
		else
		{
			System.out.println("In-correct Title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		driver.quit();

}
}