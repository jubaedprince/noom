package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhereDidYouHearPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_btn_questionOptionChecked = "//label[@for='facebook']";
			
	public static String xpath_btn_surveyControlsNext = "//*[@class='survey__controls-next-btn']";
	
	public WhereDidYouHearPage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement btn_questionOptionChecked() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_questionOptionChecked));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_surveyControlsNext() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_surveyControlsNext));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
