package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_txtbx_name = "//*[@id=\"inputName\"]";
	
	public static String xpath_txtbx_email = "//*[@id=\"inputEmail\"]";
	
	public static String xpath_btn_surveyControlsNext = "//*[@id=\"signup-form-submit\"]";
			
	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txtbx_name() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_name));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txtbx_email() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_email));
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
