package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownUtility {

	/**
	 * @author divyaadurthy
	 * @param selector
	 * @param driver
	 * @return webelement This method will return the webelement by
	 *         .id,classname,name,css,xpath,linktext, partial linktext
	 * 
	 * 
	 */

	public static WebElement getElement(By selector, WebDriver driver) {
		WebElement ele = driver.findElement(selector);
		return ele;

	}

	/**
	 * @author divyaadurthy
	 * @param Selector
	 * @param Value
	 * @param driver   This method will select the dropdown by the visiable text
	 */

	public static void selectValueFromDropdownValue(By Selector, String Value, WebDriver driver) {
		WebElement element = getElement(Selector, driver);
		Select select = new Select(element);
		select.selectByVisibleText(Value);

	}

	/**
	 * @author divyaadurthy
	 * @param Selector
	 * @param Value
	 * @param driver   This method will select the drop down by Index number
	 * 
	 */

	public static void selectValuefromDropdownIndex(By Selector, int Value, WebDriver driver) {
		WebElement element = getElement(Selector, driver);
		Select select = new Select(element);
		select.selectByIndex(Value);

	}

	/**
	 * @author divyaadurthy
	 * @param Selector @param driver
	 * @return ArrayList This methods will return all the options from the dropdown
	 * @exception it wioll throw ElementnotfoundExpection
	 */

	public static ArrayList<String> getDropDownOptions(By Selector, WebDriver driver) {
		ArrayList<String> optionsList = new ArrayList<String>();
		WebElement Element = getElement(Selector, driver);
		Select select = new Select(Element);
		java.util.List<WebElement> monthoptions = select.getOptions();
		int n = monthoptions.size();

		for (int i = 0; i < n; i++) {
			String monthValues = monthoptions.get(i).getText();
			optionsList.add(monthValues);
		}
		return optionsList;
	}

}