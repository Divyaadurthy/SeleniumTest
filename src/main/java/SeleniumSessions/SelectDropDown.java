package SeleniumSessions;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class SelectDropDown {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/divyaadurthy/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/?stype=lo&jlou=Afd9hqDr7oNNFjIx6wJwB1eX5thDUQWIzceoL9mpK7_n7zDvJH0FhSnUhwzCIO3Q1VRaxVc75tP5GkrQU7bOmER7x_Fezub1BUEsQof3kiZceQ&smuh=23602&lh=Ac8glQvYBdeVERYa");

		By month = By.id("month");
		By day = By.id("day");
		By year = By.id("year");

		SelectDropDownUtility.selectValueFromDropdownValue(month, "May", driver);
		SelectDropDownUtility.selectValueFromDropdownValue(day, "22", driver);
		SelectDropDownUtility.selectValueFromDropdownValue(year, "1989", driver);

		/*
		 * SelectDropDownUtility.selectValuefromDropdownIndex(month, 3, driver);
		 * SelectDropDownUtility.selectValuefromDropdownIndex(day, 5, driver);
		 * SelectDropDownUtility.selectValuefromDropdownIndex(year, 6, driver);
		 */
		SelectDropDownUtility.getDropDownOptions(month, driver);
		// SelectDropDownUtility.getElement(day, driver);
		Select select = new Select(SelectDropDownUtility.getElement(month, driver));
		select.isMultiple();
		WebElement text = select.getFirstSelectedOption();

		driver.findElements(By.xpath("//select[@id='month']/option"));

	}
}