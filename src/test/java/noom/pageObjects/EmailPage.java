package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_txtbxEmail = "//*[@id='email']";
	
	public static String xpath_btn_surveyControlsNext = "//*[@id=\"root\"]/div/section/div[2]/div/div[2]/div[1]/div[2]/div/button[2]";
	
	public EmailPage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement txtbx_email() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbxEmail));
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
