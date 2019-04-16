package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdrivePraticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @author divyaadurthy This is testcase to open amazon.com and validate the
		 *         title as amazon
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/divyaadurthy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);

		// Test case validation

		if (title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Correct  title");
		} else {
			System.out.println("In-Correct  title");
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		}
	}
}
